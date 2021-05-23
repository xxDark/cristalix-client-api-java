package dev.xdark.clientapi.event.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.resource.ResourcePack;
import dev.xdark.clientapi.util.SideEffects;

import java.util.List;

@SidedApi(Side.SERVER)
public interface ResourcesReload extends Event {

  EventBus<ResourcesReload> BUS = SideEffects.objectValue();

  List<ResourcePack> getResourcePacks();
}
