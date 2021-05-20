package dev.xdark.clientapi.event.chunk;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;
import dev.xdark.clientapi.world.chunk.Chunk;

@SidedApi(Side.SERVER)
public interface ChunkUnload extends Event {

  EventBus<ChunkUnload> BUS = SideEffects.objectValue();

  Chunk getChunk();
}
