package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface ToolMaterial {

  ToolMaterial WOOD = objectValue(),
      STONE = objectValue(),
      IRON = objectValue(),
      DIAMOND = objectValue(),
      GOLD = objectValue();

  int getMaxUses();

  float getEfficiency();

  float getAttackDamage();

  int getHarvestLevel();

  int getEnchantability();

  Item getRepairItem();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder maxUses(int maxUses);

    Builder efficiency(float efficiency);

    Builder attackDamage(float attackDamage);

    Builder harvestLevel(int harvestLevel);

    Builder enchantability(int enchantability);

    Builder repairItem(Item repairItem);

    ToolMaterial build();
  }
}
