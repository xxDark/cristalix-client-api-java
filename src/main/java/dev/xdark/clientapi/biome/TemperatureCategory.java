package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface TemperatureCategory {

  TemperatureCategory OCEAN = objectValue(),
      COLD = objectValue(),
      MEDIUM = objectValue(),
      WARM = objectValue();
}
