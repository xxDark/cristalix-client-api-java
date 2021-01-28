package dev.xdark.clientapi.event.chunk;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.world.chunk.Chunk;

@SidedApi(Side.SERVER)
public interface ChunkLoad {

  String KEY = "chunk_load";

  Chunk getChunk();
}
