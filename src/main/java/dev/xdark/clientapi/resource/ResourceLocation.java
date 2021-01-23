package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface ResourceLocation {

  String getNamespace();

  String getPath();

  ResourceLocation changeNamespace(String newNamespace);

  ResourceLocation changePath(String newPath);
}
