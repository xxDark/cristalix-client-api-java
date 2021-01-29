package dev.xdark.clientapi.entity;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.SERVER)
public interface PlayerModelPart {

  PlayerModelPart CAPE = objectValue(),
      JACKET = objectValue(),
      LEFT_SLEEVE = objectValue(),
      RIGHT_SLEEVE = objectValue(),
      LEFT_PANTS_LEG = objectValue(),
      RIGHT_PANTS_LEG = objectValue(),
      HAT = objectValue();

  int getMask();

  int getId();

  String getRawName();

  Text getName();
}
