package dev.xdark.clientapi.event.chunk;

import dev.xdark.clientapi.world.chunk.Chunk;

public interface ChunkUnload {

  String KEY = "chunk_unload";

  Chunk getChunk();
}
