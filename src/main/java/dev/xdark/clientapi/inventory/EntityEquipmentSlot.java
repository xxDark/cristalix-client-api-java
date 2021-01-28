package dev.xdark.clientapi.inventory;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface EntityEquipmentSlot {

  EntityEquipmentSlot MAINHAND = objectValue(),
      OFFHAND = objectValue(),
      FEET = objectValue(),
      LEGS = objectValue(),
      CHEST = objectValue(),
      HEAD = objectValue();

  Type getSlotType();

  int getIndex();

  int getSlotIndex();

  String getName();

  interface Type {

    Type HAND = objectValue(),
        ARMOR = objectValue();
  }
}
