package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ItemArmor extends Item {

  ArmorMaterial getMaterial();

  @SidedApi(Side.SERVER)
  interface Builder extends Item.Builder {

    Builder armorMaterial(ArmorMaterial armorMaterial);

    @Override
    ItemArmor build();
  }
}
