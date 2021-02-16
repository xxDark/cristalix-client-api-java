package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface HoverEvent {

  static HoverEvent of(Action action, Text value) {
    throw CompileStub.create();
  }

  Action getAction();

  Text getValue();

  @SidedApi(Side.BOTH)
  interface Action {

    Action SHOW_TEXT = objectValue(),
        SHOW_ITEM = objectValue(),
        SHOW_ENTITY = objectValue();
  }
}
