package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.inventory.EntityEquipmentSlot;

import java.util.UUID;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface ItemArmor extends Item {

  UUID[] ARMOR_MODIFIERS = objectValue();

  EntityEquipmentSlot getSlot();

  ArmorMaterial getMaterial();

  @SidedApi(Side.SERVER)
  interface Builder extends Item.Builder {

    Builder slot(EntityEquipmentSlot slot);

    Builder armorMaterial(ArmorMaterial armorMaterial);

    @Override
    ItemArmor build();
  }
}
