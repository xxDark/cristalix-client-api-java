package dev.xdark.clientapi.world;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.biome.Biome;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.tile.TileEntity;

@SidedApi(Side.BOTH)
public interface BlockAccess {

  @SidedApi(Side.SERVER)
  TileEntity getTileEntity(int x, int y, int z);

  int getCombinedLight(int x, int y, int z, int dflt);

  @SidedApi(Side.SERVER)
  BlockState getBlockState(double x, double y, double z);

  @SidedApi(Side.SERVER)
  BlockState getBlockState(int x, int y, int z);

  @SidedApi(Side.SERVER)
  boolean isAirBlock(int x, int y, int z);

  @SidedApi(Side.SERVER)
  Biome getBiome(int x, int y, int z);
}
