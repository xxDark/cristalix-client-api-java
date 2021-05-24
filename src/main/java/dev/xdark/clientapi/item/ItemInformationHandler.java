package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.world.World;

import java.util.List;

@SidedApi(Side.SERVER)
public interface ItemInformationHandler {

  void addInformation(ItemStack stack, World world, List<String> tooltip, TooltipFlag flag);
}
