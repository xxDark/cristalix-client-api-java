package dev.xdark.clientapi.event.chunk;

import dev.xdark.clientapi.world.chunk.Chunk;

public interface ChunkLoad {

  String KEY = "chunk_load";

  Chunk getChunk();
}
