package dev.xdark.clientapi.util;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface Mirror {

  Mirror NONE = objectValue(), LEFT_RIGHT = objectValue(), FRONT_BACK = objectValue();

  int mirrorRotation(int rotation, int count);

  Rotation toRotation(EnumFacing facing);

  EnumFacing mirror(EnumFacing facing);
}
