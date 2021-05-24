package dev.xdark.clientapi.biome;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Biome {

  int getSkyColorByTemperature(float temperature);

  boolean canSnow();

  boolean canRain();

  boolean isHighHumidity();

  float getTemperature(int x, int y, int z);

  int getGrassColorAtPos(int x, int y, int z);

  int getFoliageColorAtPos(int x, int y, int z);

  TemperatureCategory getTempCategory();

  float getBaseHeight();

  float getRainfall();

  int getId();

  String getName();

  float getHeightVariation();

  float getDefaultTemperature();

  int getWaterColor();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder properties(BiomeProperties properties);

    Builder skyColorProvider(SkyColorProvider skyColorProvider);

    Builder temperatureProvider(TemperatureProvider temperatureProvider);

    Builder grassColorProvider(GrassColorProvider grassColorProvider);

    Builder foliageColorProvider(FoliageColorProvider foliageColorProvider);

    Builder temperatureCategoryProvider(TemperatureCategoryProvider temperatureCategoryProvider);

    Builder waterColorProvider(WaterColorProvider waterColorProvider);

    Biome build();
  }
}
