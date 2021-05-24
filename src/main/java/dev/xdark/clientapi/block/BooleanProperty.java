package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface BooleanProperty extends Property<Boolean> {

  static BooleanProperty create(String name) {
    throw CompileStub.create();
  }
}
