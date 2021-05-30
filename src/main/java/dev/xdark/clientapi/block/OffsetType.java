package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface OffsetType {

  OffsetType NONE = objectValue(), XZ = objectValue(), XYZ = objectValue();
}
