package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface ItemRegistry {

  Item getItem(int id);

  Item getItem(String idOrLocation);

  void register(int id, ResourceLocation location, Item item);

  void register(Block block);
}
