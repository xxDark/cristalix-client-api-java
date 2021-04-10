package dev.xdark.clientapi.renderer.block.statemap;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.renderer.block.model.ModelResourceLocation;

@SidedApi(Side.SERVER)
public interface StateMapper {

    ModelResourceLocation getModelResourceLocation(BlockState state);
}
