package dev.xdark.clientapi.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

@SidedApi(Side.BOTH)
public interface ResourcePack {

  InputStream getInputStream(ResourceLocation location) throws IOException;

  boolean resourceExists(ResourceLocation location);

  Set<String> getResourceDomains();

  BufferedImage getPackImage() throws IOException;

  String getPackName();
}
