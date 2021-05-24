package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface TooltipFlag {

  TooltipFlag NORMAL = objectValue(), ADVANCED = objectValue();
}
