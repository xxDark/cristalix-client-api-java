package dev.xdark.clientapi.texture;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.text.Text;

import java.awt.image.BufferedImage;
import java.nio.file.Path;

@SidedApi(Side.SERVER)
public interface RenderEngine {

  boolean loadTexture(ResourceLocation location, Texture texture);

  ResourceLocation getDynamicTextureLocation(String name, DynamicTexture texture);

  void deleteTexture(ResourceLocation location);

  void bindTexture(ResourceLocation location);

  void bindTexture(Texture texture);

  Texture newSimpleTexture(ResourceLocation location);

  DynamicTexture newDynamicTexture(BufferedImage image);

  DynamicTexture newDynamicTexture(int width, int height);

  Texture newImageTexture(BufferedImage image, boolean blur, boolean clamp);

  Text newRemoteTexture(Path cachePath, String remoteUrl, ResourceLocation location);
}
