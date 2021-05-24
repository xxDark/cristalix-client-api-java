package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface BiomeProperties {

  String getName();

  float getBaseHeight();

  float getHeightVariation();

  float getTemperature();

  float getRainfall();

  int getWaterColor();

  boolean isSnowEnabled();

  boolean isRainEnabled();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder name(String name);

    Builder baseHeight(float baseHeight);

    Builder heightVariation(float heightVariation);

    Builder temperature(float temperature);

    Builder rainfall(float rainfall);

    Builder waterColor(int waterColor);

    Builder enableSnow(boolean enable);

    Builder enableRain(boolean enable);

    BiomeProperties build();
  }
}
