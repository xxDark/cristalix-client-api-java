package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface NBTPrimitive extends NBTBase {

  static NBTPrimitive of(long value) {
    throw CompileStub.create();
  }

  static NBTPrimitive of(double value) {
    throw CompileStub.create();
  }

  static NBTPrimitive of(int value) {
    throw CompileStub.create();
  }

  static NBTPrimitive of(float value) {
    throw CompileStub.create();
  }

  static NBTPrimitive of(short value) {
    throw CompileStub.create();
  }

  static NBTPrimitive of(byte value) {
    throw CompileStub.create();
  }

  static NBTPrimitive of(boolean value) {
    throw CompileStub.create();
  }

  long getLong();

  int getInt();

  short getShort();

  byte getByte();

  double getDouble();

  float getFloat();
}
