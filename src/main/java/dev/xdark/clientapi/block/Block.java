package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Block {

  static Block of(int id) {
    throw CompileStub.create();
  }

  static Block of(String idOrLocation) {
    throw CompileStub.create();
  }

  int getId();

  ResourceLocation getLocation();

  BlockState getDefaultState();

  BlockState getStateFromMeta(int meta);

  int getMetaFromState(BlockState state);

  boolean hasTileEntity();

  String getLocalizedName();

  String getTranslationKey();
}
