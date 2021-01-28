package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public final class MathHelper {

  private MathHelper() {
  }

  public static float sin(float value) {
    throw CompileStub.INSTANCE;
  }

  public static float cos(float value) {
    throw CompileStub.INSTANCE;
  }

  public static float asin(float value) {
    throw CompileStub.INSTANCE;
  }

  public static float acos(float value) {
    throw CompileStub.INSTANCE;
  }

  public static float floor(float value) {
    throw CompileStub.INSTANCE;
  }

  public static double floor(double value) {
    throw CompileStub.INSTANCE;
  }

  public static int clamp(int value, int min, int max) {
    throw CompileStub.INSTANCE;
  }

  public static float clamp(float value, float min, float max) {
    throw CompileStub.INSTANCE;
  }

  public static double clamp(double value, double min, double max) {
    throw CompileStub.INSTANCE;
  }

  public static float wrapDegrees(float degrees) {
    throw CompileStub.INSTANCE;
  }

  public static double wrapDegrees(double degrees) {
    throw CompileStub.INSTANCE;
  }

  public static int wrapDegrees(int degrees) {
    throw CompileStub.INSTANCE;
  }

  public static int smallestEncompassingPowerOfTwo(int value) {
    throw CompileStub.INSTANCE;
  }

  public static boolean isPowerOfTwo(int value) {
    throw CompileStub.INSTANCE;
  }

  public static int log2DeBruijn(int value) {
    throw CompileStub.INSTANCE;
  }

  public static int log2(int value) {
    throw CompileStub.INSTANCE;
  }

  public static double atan2(double x, double y) {
    throw CompileStub.INSTANCE;
  }

  public static double fastInvSqrt(double value) {
    throw CompileStub.INSTANCE;
  }
}
