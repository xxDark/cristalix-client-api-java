package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface SkyColorProvider {

  int getSkyColorByTemperature(Biome biome, float temperature);
}
