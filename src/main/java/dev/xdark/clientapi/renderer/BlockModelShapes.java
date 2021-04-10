package dev.xdark.clientapi.renderer;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.renderer.block.model.BakedModel;
import dev.xdark.clientapi.renderer.block.model.ModelManager;
import dev.xdark.clientapi.renderer.block.statemap.BlockStateMapper;
import dev.xdark.clientapi.renderer.block.statemap.StateMapper;
import dev.xdark.clientapi.renderer.texture.TextureAtlasSprite;

@SidedApi(Side.SERVER)
public interface BlockModelShapes {

  BlockStateMapper getBlockStateMapper();

  TextureAtlasSprite getTexture(BlockState state);

  BakedModel getModelForState(BlockState state);

  ModelManager getModelManager();

  void reloadModels();

  void registerBlockWithStateMapper(Block block, StateMapper stateMapper);

  void registerBuiltInBlocks(Block... blocks);
}
