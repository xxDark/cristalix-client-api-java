package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface ScaleChange {

  String KEY = "scale_change";

  int getOld();

  int getNew();
}
