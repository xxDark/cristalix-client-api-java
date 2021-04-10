package dev.xdark.clientapi.renderer.block.model.multipart;

import com.google.common.base.Predicate;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.block.BlockStateContainer;
import dev.xdark.clientapi.renderer.block.model.VariantList;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Selector {

  static Selector of(Condition condition, VariantList variants) {
    throw CompileStub.create();
  }

  VariantList getVariants();

  Predicate<BlockState> getPredicate(BlockStateContainer container);
}