package dev.xdark.clientapi.settings;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface KeyBinding extends Comparable<KeyBinding> {

  boolean isKeyDown();

  String getCategory();

  boolean isPressed();

  String getDescription();

  int getKeyCodeDefault();

  int getKeyCode();

  @SidedApi(Side.SERVER)
  interface Builder {
    static Builder builder() {
      throw CompileStub.create();
    }

    Builder description(String description);

    Builder category(String category);

    Builder keyCode(int keyCode);

    KeyBinding build();
  }
}
