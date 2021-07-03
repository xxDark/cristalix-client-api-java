package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.util.Mirror;

@SidedApi(Side.SERVER)
public interface MirrorHandler {

  BlockState withMirror(BlockState state, Mirror mirror);
}
