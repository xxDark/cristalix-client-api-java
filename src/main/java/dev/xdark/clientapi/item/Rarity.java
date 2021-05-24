package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.TextFormatting;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface Rarity {

  Rarity COMMON = objectValue(),
      UNCOMMON = objectValue(),
      RARE = objectValue(),
      EPIC = objectValue();

  TextFormatting getFormatting();

  String getName();
}
