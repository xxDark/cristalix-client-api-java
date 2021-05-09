package dev.xdark.clientapi.input;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public final class KeyboardHelper {

  private KeyboardHelper() {}

  public static boolean isCtrlKeyDown() {
    throw CompileStub.create();
  }

  public static boolean isShiftKeyDown() {
    throw CompileStub.create();
  }

  public static boolean isAltKeyDown() {
    throw CompileStub.create();
  }

  public static boolean isKeyComboCtrlX(int key) {
    throw CompileStub.create();
  }

  public static boolean isKeyComboCtrlV(int key) {
    throw CompileStub.create();
  }

  public static boolean isKeyComboCtrlC(int key) {
    throw CompileStub.create();
  }

  public static boolean isKeyComboCtrlA(int key) {
    throw CompileStub.create();
  }
}
