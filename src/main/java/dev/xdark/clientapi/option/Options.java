package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public final class Options {

  private Options() {}

  public static <V> Option<V> blackhole(Option<V> option) {
    throw CompileStub.create();
  }

  public static LongOption blackhole(LongOption option) {
    throw CompileStub.create();
  }

  public static DoubleOption blackhole(DoubleOption option) {
    throw CompileStub.create();
  }

  public static IntOption blackhole(IntOption option) {
    throw CompileStub.create();
  }

  public static FloatOption blackhole(FloatOption option) {
    throw CompileStub.create();
  }

  public static BooleanOption blackhole(BooleanOption option) {
    throw CompileStub.create();
  }
}
