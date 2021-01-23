package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.io.Closeable;
import java.io.InputStream;

@SidedApi(Side.BOTH)
public interface Resource extends Closeable {

  ResourceLocation getLocation();

  InputStream getInputStream();

  ResourcePack getPack();
}
