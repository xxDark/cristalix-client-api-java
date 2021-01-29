package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface NBTPrimitive extends NBTBase {

  static NBTPrimitive create(long value) {
    throw CompileStub.INSTANCE;
  }

  static NBTPrimitive create(double value) {
    throw CompileStub.INSTANCE;
  }

  static NBTPrimitive create(int value) {
    throw CompileStub.INSTANCE;
  }

  static NBTPrimitive create(float value) {
    throw CompileStub.INSTANCE;
  }

  static NBTPrimitive create(short value) {
    throw CompileStub.INSTANCE;
  }

  static NBTPrimitive create(byte value) {
    throw CompileStub.INSTANCE;
  }

  static NBTPrimitive create(boolean value) {
    throw CompileStub.INSTANCE;
  }

  long getLong();

  int getInt();

  short getShort();

  byte getByte();

  double getDouble();

  float getFloat();
}
