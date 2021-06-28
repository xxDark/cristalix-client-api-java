package dev.xdark.clientapi.block.state;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.block.properties.Property;
import dev.xdark.clientapi.util.CompileStub;

import java.util.Collection;
import java.util.List;

@SidedApi(Side.SERVER)
public interface BlockStateContainer {

  static BlockStateContainer of(Block block) {
    throw CompileStub.create();
  }

  static BlockStateContainer of(Block block, Property<?> property) {
    throw CompileStub.create();
  }

  static BlockStateContainer of(Block block, Property<?>... properties) {
    throw CompileStub.create();
  }

  List<BlockState> getValidStates();

  BlockState getBaseState();

  Block getBlock();

  Collection<Property<?>> getProperties();

  Property<?> getProperty(String name);
}
