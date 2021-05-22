package dev.xdark.clientapi.renderer.block.model.multipart;

import com.google.common.base.Predicate;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.block.BlockStateContainer;
import dev.xdark.clientapi.renderer.block.model.Variant;
import dev.xdark.clientapi.renderer.block.model.VariantList;
import dev.xdark.clientapi.util.CompileStub;

import java.util.List;

@SidedApi(Side.SERVER)
public interface Selector {

  static Selector of(Condition condition, List<Variant> variants) {
    throw CompileStub.create();
  }

  VariantList getVariants();

  Predicate<BlockState> getPredicate(BlockStateContainer container);
}
