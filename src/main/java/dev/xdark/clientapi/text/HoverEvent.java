package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

public interface HoverEvent {

  Action getAction();

  Text getValue();

  interface Action {

    Action SHOW_TEXT = objectValue(),
        SHOW_ITEM = objectValue(),
        SHOW_ENTITY = objectValue();
  }
}
