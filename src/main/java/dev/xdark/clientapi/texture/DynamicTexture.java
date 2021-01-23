package dev.xdark.clientapi.texture;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface DynamicTexture extends Texture {

  void updateDynamicTexture();

  int[] getTextureData();
}
