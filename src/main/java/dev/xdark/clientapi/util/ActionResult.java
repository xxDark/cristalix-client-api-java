package dev.xdark.clientapi.util;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ActionResult {

  ActionResult SUCCESS = objectValue(), PASS = objectValue(), FAIL = objectValue();
}
