package dev.xdark.clientapi.util;

public final class SideEffects {

  private SideEffects() { }

  public static long longValue() {
    return 0L;
  }

  public static double doubleValue() {
    return 0.0D;
  }

  public static int intValue() {
    return 0;
  }

  public static float floatValue() {
    return 0.0F;
  }

  public static short shortValue() {
    return 0;
  }

  public static byte byteValue() {
    return 0;
  }

  public static boolean booleanValue() {
    return false;
  }

  public static <T> T objectValue() {
    return null;
  }
}
