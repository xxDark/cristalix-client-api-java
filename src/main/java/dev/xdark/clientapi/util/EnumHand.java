package dev.xdark.clientapi.util;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

public interface EnumHand {

  EnumHand MAIN_HAND = objectValue(),
      OFF_HAND = objectValue();
}
