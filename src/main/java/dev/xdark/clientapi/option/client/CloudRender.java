package dev.xdark.clientapi.option.client;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface CloudRender {

  CloudRender FAST = objectValue(), FANCY = objectValue(), OFF = objectValue();
}
