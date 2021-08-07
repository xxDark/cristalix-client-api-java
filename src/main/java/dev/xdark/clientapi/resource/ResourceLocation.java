package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface ResourceLocation {

  static ResourceLocation of(String namespace, String path) {
    throw CompileStub.create();
  }

  static ResourceLocation of(String input) {
    throw CompileStub.create();
  }

  String getNamespace();

  String getPath();

  ResourceLocation changeNamespace(String newNamespace);

  ResourceLocation changePath(String newPath);
}
