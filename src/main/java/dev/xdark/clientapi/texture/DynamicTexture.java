package dev.xdark.clientapi.texture;

public interface DynamicTexture extends Texture {

  void updateDynamicTexture();

  int[] getTextureData();
}
