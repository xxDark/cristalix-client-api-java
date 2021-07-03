package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.material.PushReaction;
import dev.xdark.clientapi.block.state.BlockState;

@SidedApi(Side.SERVER)
public interface PushReactionHandler {

  PushReaction getPushReaction(BlockState state);
}
