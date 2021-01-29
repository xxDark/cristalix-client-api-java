package dev.xdark.clientapi.event.input;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.BOTH)
public interface MousePress extends Cancellable {

  int getButton();
}
