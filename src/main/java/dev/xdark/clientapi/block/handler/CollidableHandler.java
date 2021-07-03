package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;

@SidedApi(Side.SERVER)
public interface CollidableHandler {

  boolean isCollideable(Block block);
}
