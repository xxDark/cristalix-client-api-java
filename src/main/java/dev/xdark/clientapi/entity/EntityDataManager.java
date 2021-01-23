package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface EntityDataManager {

  <T> void register(DataParameter<T> parameter, T value);

  <T> T get(DataParameter<T> parameter);

  <T> void set(DataParameter<T> parameter, T value);

  boolean isDirty();
}
