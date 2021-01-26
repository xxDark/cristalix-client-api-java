package dev.xdark.clientapi.event.input;

import dev.xdark.clientapi.event.Cancellable;

public interface KeyPress extends Cancellable {

  String KEY = "key_press";

  int getKey();
}
