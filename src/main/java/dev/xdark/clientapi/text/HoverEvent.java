package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface HoverEvent {

  Action getAction();

  Text getValue();

  interface Action {

    Action SHOW_TEXT = objectValue(),
        SHOW_ITEM = objectValue(),
        SHOW_ENTITY = objectValue();
  }
}
