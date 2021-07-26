package dev.xdark.clientapi.renderer.block.model.multipart;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.block.state.BlockStateContainer;

import java.util.function.Predicate;

@SidedApi(Side.SERVER)
public interface Condition {

  Condition TRUE = objectValue(), FALSE = objectValue();

  Predicate<BlockState> getPredicate(BlockStateContainer container);
}
