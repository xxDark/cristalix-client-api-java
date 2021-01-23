package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Timer {

  int getElapsedTicks();

  float getRenderPartialTicks();

  float getElapsedPartialTicks();

  long lastSyncSysClock();

  float getTickLength();

  void setTickLength(float tickLength);
}
