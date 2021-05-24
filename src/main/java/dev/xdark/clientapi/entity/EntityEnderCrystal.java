package dev.xdark.clientapi.entity;

import com.google.common.base.Optional;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.math.BlockPos;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface EntityEnderCrystal extends Entity {

  DataParameter<Optional<BlockPos>> BEAM_TARGET = objectValue();
  DataParameter<Boolean> SHOW_BOTTOM = objectValue();

  void setBeamTarget(BlockPos pos);

  BlockPos getBeamTarget();

  void setShowBottom(boolean showBottom);

  boolean shouldShowBottom();
}
