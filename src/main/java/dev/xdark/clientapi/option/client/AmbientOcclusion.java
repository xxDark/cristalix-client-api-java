package dev.xdark.clientapi.option.client;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface AmbientOcclusion {

  AmbientOcclusion MAX = objectValue(), MIN = objectValue(), OFF = objectValue();
}
