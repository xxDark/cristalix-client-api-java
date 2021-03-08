package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import io.netty.buffer.ByteBuf;

@SidedApi(Side.SERVER)
public final class ItemTools {

  private ItemTools() {
  }

  public static ItemStack read(ByteBuf buf) {
    throw CompileStub.create();
  }

  public static void write(ItemStack stack, ByteBuf buf) {
    throw CompileStub.create();
  }
}
