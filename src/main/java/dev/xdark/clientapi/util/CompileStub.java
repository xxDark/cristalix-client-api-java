package dev.xdark.clientapi.util;

public final class CompileStub extends RuntimeException {

  public static final CompileStub INSTANCE = new CompileStub();

  private CompileStub() {
  }

  @Override
  public Throwable fillInStackTrace() {
    return this;
  }

  @Override
  public Throwable initCause(Throwable cause) {
    return this;
  }
}
