package dev.xdark.clientapi.event.input;

import dev.xdark.clientapi.event.Cancellable;

public interface MousePress extends Cancellable {

  String KEY = "mouse_press";

  int getButton();
}
