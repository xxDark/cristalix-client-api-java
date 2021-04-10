package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.util.Collection;
import java.util.List;

@SidedApi(Side.SERVER)
public interface BlockStateContainer {

  List<BlockState> getValidStates();

  BlockState getBaseState();

  Block getBlock();

  Collection<Property<?>> getProperties();

  Property<?> getProperty(String name);
}
