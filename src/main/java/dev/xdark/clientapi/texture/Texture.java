package dev.xdark.clientapi.texture;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceManager;
import java.io.IOException;

@SidedApi(Side.SERVER)
public interface Texture {

  void setBlurMipmap(boolean blur, boolean mipmap);

  void restoreLastBlurMipmap();

  void loadTexture(ResourceManager resourceManager) throws IOException;

  int getGlTextureId();

  void deleteGlTexture();
}
