package dev.xdark.clientapi.jvm;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ClassDefiner {

  Class<?> defineClass(String name, byte[] code, int off, int len);
}
