package dev.xdark.clientapi.event;

public interface RegisteredListener {

  Listener getListener();

  void unregister();
}
