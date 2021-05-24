package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface UseAction {

  UseAction NONE = objectValue(),
      EAT = objectValue(),
      DRINK = objectValue(),
      BLOCK = objectValue(),
      BOW = objectValue();
}
