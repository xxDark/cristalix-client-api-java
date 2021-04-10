package dev.xdark.clientapi.renderer.texture;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.Resource;
import dev.xdark.clientapi.resource.data.AnimationMetadataSection;
import dev.xdark.clientapi.util.CompileStub;

import java.io.IOException;
import java.util.List;

@SidedApi(Side.SERVER)
public interface TextureAtlasSprite {

  static TextureAtlasSprite of(String name) {
    throw CompileStub.create();
  }

  int getOriginX();

  int getOriginY();

  int getIconWidth();

  int getIconHeight();

  float getMinU();

  float getMaxU();

  float getInterpolatedU(double u);

  float getUnInterpolatedU(float u);

  float getMinV();

  float getMaxV();

  float getInterpolatedV(double v);

  float getUnInterpolatedV(float v);

  String getIconName();

  void updateAnimation();

  int[][] getFrameTextureData(int idx);

  int getFrameCount();

  void setIconWidth(int w);

  void setIconHeight(int h);

  void loadSprite(PngSizeInfo sizeInfo, boolean animation) throws IOException;

  void loadSpriteFrames(TextureMap textureMap, Resource resource, int mipmapLevels)
      throws IOException;

  void generateMipmaps(int mipmaps);

  void clearFramesTextureData();

  boolean hasAnimationMetadata();

  void setFramesTextureData(List<int[][]> framesTextureData);

  int getIndexInMap();

  void setIndexInMap(int indexInMap);

  int getAnimationIndex();

  void setAnimationIndex(int animationIndex);

  boolean isAnimationActive();

  double getSpriteU16(float u);

  double getSpriteV16(float v);

  void bindSpriteTexture();

  void deleteSpriteTexture();

  float toSingleU(float u);

  float toSingleV(float v);

  List<int[][]> getFramesTextureData();

  AnimationMetadataSection getAnimationMetadata();

  void setAnimationMetadata(AnimationMetadataSection animationMetadata);
}
