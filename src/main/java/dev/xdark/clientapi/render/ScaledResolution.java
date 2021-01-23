package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface ScaledResolution {

  int getScaledWidth();

  int getScaledHeight();

  double getScaledWidth_double();

  double getScaledHeight_double();

  int getScaleFactor();
}
