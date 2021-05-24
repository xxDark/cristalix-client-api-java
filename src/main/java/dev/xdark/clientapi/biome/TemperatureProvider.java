package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface TemperatureProvider {

  float getTemperature(Biome biome, int x, int y, int z);
}
