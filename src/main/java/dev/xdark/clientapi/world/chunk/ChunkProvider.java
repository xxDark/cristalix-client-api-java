package dev.xdark.clientapi.world.chunk;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ChunkProvider {

  Chunk getLoadedChunk(int x, int z);

  Chunk provideChunk(int x, int z);

  Chunk loadChunk(int x, int z);

  void unload(int x, int z);
}
