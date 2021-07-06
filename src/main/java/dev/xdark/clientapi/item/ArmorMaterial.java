package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.inventory.EntityEquipmentSlot;
import dev.xdark.clientapi.sound.SoundEvent;
import dev.xdark.clientapi.util.CompileStub;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface ArmorMaterial {

  ArmorMaterial LEATHER = objectValue(),
      CHAIN = objectValue(),
      IRON = objectValue(),
      GOLD = objectValue(),
      DIAMOND = objectValue();

  String getName();

  float getToughness();

  int getMaxDamageFactor();

  int getDurability(EntityEquipmentSlot slot);

  int getDamageReductionAmount(EntityEquipmentSlot slot);

  int getEnchantability();

  SoundEvent getEquipSound();

  Item getRepairItem();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder name(String name);

    Builder toughness(float toughness);

    Builder maxDamageFactor(int maxDamageFactor);

    Builder damageReduction(int[] damageReduction);

    Builder maxDamage(int[] maxDamage);

    Builder enchantability(int enchantability);

    Builder equipSound(SoundEvent equipSound);

    Builder repairItem(Item repairItem);

    ArmorMaterial build();
  }
}
