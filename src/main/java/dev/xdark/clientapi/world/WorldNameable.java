package dev.xdark.clientapi.world;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.BOTH)
public interface WorldNameable {

  String getName();

  boolean hasCustomName();

  Text getDisplayName();
}
