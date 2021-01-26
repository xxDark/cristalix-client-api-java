package dev.xdark.clientapi.inventory;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

public interface ClickType {

  ClickType PICKUP = objectValue(),
      QUICK_MOVE = objectValue(),
      SWAP = objectValue(),
      CLONE = objectValue(),
      THROW = objectValue(),
      QUICK_CRAFT = objectValue(),
      PICKUP_ALL = objectValue();
}
