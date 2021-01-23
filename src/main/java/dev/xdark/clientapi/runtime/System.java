package dev.xdark.clientapi.runtime;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface System {

  void exit(int code);

  void halt(int code);

  Platform platform();

  static long currentTimeMillis() {
    return java.lang.System.currentTimeMillis();
  }

  static long nanoTime() {
    return java.lang.System.nanoTime();
  }
}
