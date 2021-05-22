package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.renderer.block.model.multipart.Multipart;
import dev.xdark.clientapi.util.CompileStub;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SidedApi(Side.SERVER)
public interface ModelBlockDefinition {

  boolean hasVariant(String name);

  VariantList getVariant(String name);

  Set<VariantList> getMultipartVariants();

  boolean hasMultipartData();

  Multipart getMultipartData();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder variants(Map<String, VariantList> variants);

    Builder multipart(Multipart multipart);

    Builder definitions(List<ModelBlockDefinition> definitions);

    ModelBlockDefinition build();
  }
}
