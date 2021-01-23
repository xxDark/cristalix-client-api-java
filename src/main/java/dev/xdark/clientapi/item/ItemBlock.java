package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;

@SidedApi(Side.SERVER)
public interface ItemBlock extends Item {

  Block getBlock();
}
