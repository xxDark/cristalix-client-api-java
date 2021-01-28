package dev.xdark.clientapi.input;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface MouseHelper {

  void grabMouseCursor();

  void ungrabMouseCursor();
}
