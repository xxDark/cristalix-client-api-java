package dev.xdark.clientapi.resource.data;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import it.unimi.dsi.fastutil.ints.IntSet;

@SidedApi(Side.SERVER)
public interface AnimationMetadataSection extends MetadataSection {

  int getFrameHeight();

  int getFrameWidth();

  int getFrameCount();

  int getFrameTime();

  boolean isInterpolate();

  int getFrameTimeSingle(int idx);

  boolean frameHasTime(int idx);

  int getFrameIndex(int idx);

  IntSet getFrameIndexSet();
}
