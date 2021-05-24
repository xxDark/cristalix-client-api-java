package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface GrassColorProvider {

    int getColorAt(Biome biome, int x, int y, int z);
}
