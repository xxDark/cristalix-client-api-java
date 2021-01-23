package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.ScaledResolution;

@SidedApi(Side.BOTH)
public interface ScaleChange {

  String KEY = "scale_change";

  ScaledResolution getOld();

  ScaledResolution getNew();
}
