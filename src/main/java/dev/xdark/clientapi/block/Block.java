package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface Block {

  int getId();

  ResourceLocation getLocation();

  BlockState getDefaultState();

  BlockState getStateFromMeta(int meta);

  int getMetaFromState(BlockState state);

  boolean hasTileEntity();

  String getLocalizedName();

  String getTranslationKey();
}
