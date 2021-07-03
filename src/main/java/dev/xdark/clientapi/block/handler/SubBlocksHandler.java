package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.gui.CreativeTab;
import dev.xdark.clientapi.item.ItemStack;

import java.util.List;

@SidedApi(Side.SERVER)
public interface SubBlocksHandler {

  void getSubBlocks(Block block, CreativeTab tab, List<ItemStack> stacks);
}
