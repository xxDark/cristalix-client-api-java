package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.item.Item;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.render.model.ItemCameraTransforms;

@SidedApi(Side.BOTH)
public interface RenderItem {

  void renderItemIntoGUI(ItemStack stack, int x, int y);

  void renderItemAndEffectIntoGUI(ItemStack stack, int x, int y);

  void renderItemOverlayIntoGUI(FontRenderer fr, ItemStack stack, int x, int y, String text);

  void renderItem(ItemStack stack, ItemCameraTransforms.Type type);

  void registerItem(Item item, int meta, String name);

  void registerBlock(Block block, int meta, String name);

  void registerBlock(Block block, String name);

  void registerItem(Item item, String name);

  @SidedApi(Side.INTERNAL)
  void unregisterItem(Item item);

  @SidedApi(Side.INTERNAL)
  void unregisterItem(Item item, int meta);

  @SidedApi(Side.INTERNAL)
  void unregisterItem(int idx);
}
