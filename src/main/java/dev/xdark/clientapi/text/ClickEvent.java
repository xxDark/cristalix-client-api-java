package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

public interface ClickEvent {

  Action getAction();

  String getValue();

  public interface Action {

    Action OPEN_URL = objectValue(),
        OPEN_FILE = objectValue(),
        RUN_COMMAND = objectValue(),
        SUGGEST_COMMAND = objectValue(),
        CHANGE_PAGE = objectValue();
  }
}
