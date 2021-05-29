package dev.xdark.clientapi.language;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Language extends Comparable<Language> {

  String getCode();

  String getRegion();

  String getName();

  boolean isBidirectional();
}
