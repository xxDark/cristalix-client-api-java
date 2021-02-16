package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface DataParameter<T> {

  static <T> DataParameter<T> of(int id, DataSerializer<T> serializer) {
    throw CompileStub.create();
  }

  int getId();

  DataSerializer<T> getSerializer();
}
