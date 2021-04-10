package dev.xdark.clientapi.renderer.block.model.multipart;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockStateContainer;
import dev.xdark.clientapi.renderer.block.model.VariantList;
import dev.xdark.clientapi.util.CompileStub;

import java.util.List;
import java.util.Set;

@SidedApi(Side.SERVER)
public interface Multipart {

  static Multipart of(List<Selector> selectors) {
    throw CompileStub.create();
  }

  List<Selector> getSelectors();

  Set<VariantList> getVariants();

  void setStateContainer(BlockStateContainer container);

  BlockStateContainer getStateContainer();
}
