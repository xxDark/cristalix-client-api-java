package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.render.ScaledResolution;

public interface ScaleChange {

  String KEY = "scale_change";

  ScaledResolution getOld();

  ScaledResolution getNew();
}
