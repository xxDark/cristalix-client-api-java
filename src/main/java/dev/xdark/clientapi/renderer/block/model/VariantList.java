package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.util.List;

@SidedApi(Side.SERVER)
public interface VariantList {

  List<Variant> getVariants();
}
