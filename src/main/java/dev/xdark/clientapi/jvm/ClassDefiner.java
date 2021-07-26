package dev.xdark.clientapi.jvm;

public interface ClassDefiner {

  Class<?> defineClass(String name, byte[] code, int off, int len);
}
