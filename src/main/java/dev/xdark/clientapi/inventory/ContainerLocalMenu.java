package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface ContainerLocalMenu extends InventoryBasic {

  static ContainerLocalMenu of(String type, Text name, int slots) {
    throw CompileStub.INSTANCE;
  }
}
