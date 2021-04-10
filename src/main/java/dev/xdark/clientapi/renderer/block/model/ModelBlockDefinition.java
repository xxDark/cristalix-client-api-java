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

  static ModelBlockDefinition of(Map<String, VariantList> variants, Multipart multipart) {
    throw CompileStub.create();
  }

  static ModelBlockDefinition of(List<ModelBlockDefinition> definitions) {
    throw CompileStub.create();
  }

  boolean hasVariant(String name);

  VariantList getVariant(String name);

  Set<VariantList> getMultipartVariants();

  boolean hasMultipartData();

  Multipart getMultipartData();
}
