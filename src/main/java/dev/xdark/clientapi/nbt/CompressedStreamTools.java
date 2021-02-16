package dev.xdark.clientapi.nbt;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@SidedApi(Side.SERVER)
public final class CompressedStreamTools {

  private CompressedStreamTools() {
  }

  public static NBTTagCompound readCompressed(InputStream in) throws IOException {
    throw CompileStub.create();
  }

  public static void writeCompressed(NBTTagCompound compound, OutputStream out) throws IOException {
    throw CompileStub.create();
  }
}
