package dev.xdark.clientapi.jvm;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import sun.misc.Unsafe;

@SidedApi(Side.BOTH)
public final class Intrinsics {

  private Intrinsics() { }

  public static String newStringUnsafe(char[] chars) {
    throw CompileStub.create();
  }

  public static char[] getChars(String str) {
    throw CompileStub.create();
  }

  @SidedApi(Side.SERVER)
  public static Unsafe getUnsafe() {
    throw CompileStub.create();
  }
}
