package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import io.netty.buffer.ByteBuf;

@SidedApi(Side.SERVER)
public interface DataSerializer<T> {

  void write(ByteBuf buf, T value);

  T read(ByteBuf buf);

  DataParameter<T> createKey(int id);

  T copyValue(T value);
}
