package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface ClickEvent {

  static ClickEvent of(Action action, String value) {
    throw CompileStub.create();
  }

  Action getAction();

  String getValue();

  @SidedApi(Side.BOTH)
  interface Action {

    Action OPEN_URL = objectValue(),
        OPEN_FILE = objectValue(),
        RUN_COMMAND = objectValue(),
        SUGGEST_COMMAND = objectValue(),
        CHANGE_PAGE = objectValue();
  }
}
