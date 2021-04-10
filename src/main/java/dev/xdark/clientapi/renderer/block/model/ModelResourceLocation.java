package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

public interface ModelResourceLocation extends ResourceLocation {

  static ModelResourceLocation of(String input) {
    throw CompileStub.create();
  }

  static ModelResourceLocation of(ResourceLocation namespace, String path) {
    throw CompileStub.create();
  }

  static ModelResourceLocation of(String namespace, String name) {
    throw CompileStub.create();
  }

  String getVariant();
}
