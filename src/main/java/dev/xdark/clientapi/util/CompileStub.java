package dev.xdark.clientapi.util;

public final class CompileStub extends RuntimeException {

  private static final boolean DEBUGGING = true;
  private static final CompileStub INSTANCE = new CompileStub(0);

  private CompileStub(int unused) {
    super(null, null, false, false);
  }

  private CompileStub() {
  }

  public static CompileStub create() {
    return DEBUGGING ? new CompileStub() : INSTANCE;
  }
}
