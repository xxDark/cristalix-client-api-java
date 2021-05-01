package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public final class MathHelper {

  private MathHelper() {
  }

  public static float sin(float value) {
    throw CompileStub.create();
  }

  public static float cos(float value) {
    throw CompileStub.create();
  }

  public static float asin(float value) {
    throw CompileStub.create();
  }

  public static float acos(float value) {
    throw CompileStub.create();
  }

  public static int floor(float value) {
    throw CompileStub.create();
  }

  public static int floor(double value) {
    throw CompileStub.create();
  }

  public static int clamp(int value, int min, int max) {
    throw CompileStub.create();
  }

  public static float clamp(float value, float min, float max) {
    throw CompileStub.create();
  }

  public static double clamp(double value, double min, double max) {
    throw CompileStub.create();
  }

  public static float wrapDegrees(float degrees) {
    throw CompileStub.create();
  }

  public static double wrapDegrees(double degrees) {
    throw CompileStub.create();
  }

  public static int wrapDegrees(int degrees) {
    throw CompileStub.create();
  }

  public static int smallestEncompassingPowerOfTwo(int value) {
    throw CompileStub.create();
  }

  public static boolean isPowerOfTwo(int value) {
    throw CompileStub.create();
  }

  public static int log2DeBruijn(int value) {
    throw CompileStub.create();
  }

  public static int log2(int value) {
    throw CompileStub.create();
  }

  public static double atan2(double x, double y) {
    throw CompileStub.create();
  }

  public static double fastInvSqrt(double value) {
    throw CompileStub.create();
  }
}
