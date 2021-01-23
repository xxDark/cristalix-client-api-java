package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.render.ScaledResolution;

public interface ScaleChange {

  ScaledResolution getOld();

  ScaledResolution getNew();
}
