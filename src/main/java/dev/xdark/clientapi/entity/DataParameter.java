package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface DataParameter<T> {

  int getId();
}
