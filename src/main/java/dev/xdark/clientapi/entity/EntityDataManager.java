package dev.xdark.clientapi.entity;

public interface EntityDataManager {

  <T> void register(DataParameter<T> parameter, T value);

  <T> T get(DataParameter<T> parameter);

  <T> void set(DataParameter<T> parameter, T value);

  boolean isDirty();
}
