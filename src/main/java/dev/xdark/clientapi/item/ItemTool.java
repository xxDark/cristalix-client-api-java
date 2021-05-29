package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.util.CompileStub;

import java.util.Set;

@SidedApi(Side.SERVER)
public interface ItemTool extends Item {

  float getEfficiency();

  float getAttackDamage();

  float getAttackSpeed();

  ToolMaterial getToolMaterial();

  @SidedApi(Side.SERVER)
  interface Builder extends Item.Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder attackSpeed(float attackSpeed);

    Builder toolMaterial(ToolMaterial toolMaterial);

    Builder effectiveBlocks(Set<Block> effectiveBlocks);

    ItemTool build();
  }
}
