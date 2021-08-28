package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.nio.ByteBuffer;

@SidedApi(Side.BOTH)
public interface BufferBuilder {

  void sortVertexData(float cameraX, float cameraY, float cameraZ);

  void reset();

  void begin(int glMode, VertexFormat format);

  BufferBuilder tex(double u, double v);

  BufferBuilder lightmap(int skyLight, int blockLight);

  void putBrightness4(int vertex0, int vertex1, int vertex2, int vertex3);

  void putPosition(double x, double y, double z);

  int getColorIndex(int vertexIndex);

  void putColorMultiplier(float red, float green, float blue, int vertexIndex);

  void putColorRGB_F(float red, float green, float blue, int vertexIndex);

  void putColorRGBA(int index, int red, int green, int blue);

  void noColor();

  BufferBuilder color(int red, int green, int blue, int alpha);

  void addVertexData(int[] vertexData);

  void endVertex();

  BufferBuilder pos(double x, double y, double z);

  void putNormal(float x, float y, float z);

  BufferBuilder normal(float x, float y, float z);

  void setTranslation(double x, double y, double z);

  void finishDrawing();

  int getVertexCount();

  int getDrawMode();

  void putColor4(int argb);

  void putColorRGB_F4(float red, float green, float blue);

  int getNextIndex();

  int getBufferSize();

  @SidedApi(Side.SERVER)
  ByteBuffer getBufferData();

  @SidedApi(Side.SERVER)
  void putBulkData(ByteBuffer buffer);

  @SidedApi(Side.SERVER)
  State getState();

  @SidedApi(Side.SERVER)
  void setState(State state);

  @SidedApi(Side.SERVER)
  interface State {

    int[] getRawBuffer();

    int getVertexCount();

    VertexFormat getVertexFormat();
  }
}
