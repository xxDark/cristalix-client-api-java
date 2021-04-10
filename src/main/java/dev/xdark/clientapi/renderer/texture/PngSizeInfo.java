package dev.xdark.clientapi.renderer.texture;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

import java.io.IOException;
import java.io.InputStream;

@SidedApi(Side.SERVER)
public interface PngSizeInfo {

  int getWidth();

  int getHeight();

  static PngSizeInfo of(int width, int height) {
    throw CompileStub.create();
  }

  static PngSizeInfo of(InputStream in) throws IOException {
    throw CompileStub.create();
  }
}
