package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface ItemSword extends Item {

  float getAttackDamage();

  ToolMaterial getToolMaterial();

  @SidedApi(Side.SERVER)
  interface Builder extends Item.Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder toolMaterial(ToolMaterial toolMaterial);

    @Override
    ItemSword build();
  }
}
