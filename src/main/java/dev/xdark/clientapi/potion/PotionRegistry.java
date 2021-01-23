package dev.xdark.clientapi.potion;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface PotionRegistry {

  Potion getPotion(int id);

  Potion getPotion(ResourceLocation location);
}
