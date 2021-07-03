package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.item.TooltipFlag;
import dev.xdark.clientapi.world.World;

import java.util.List;

@SidedApi(Side.SERVER)
public interface InformationHandler {

  void addInformation(Block block,ItemStack stack, World world, List<String> info, TooltipFlag tooltipFlag);
}
