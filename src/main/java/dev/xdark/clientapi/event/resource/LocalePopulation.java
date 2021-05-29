package dev.xdark.clientapi.event.resource;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.language.Locale;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface LocalePopulation extends Event {

  EventBus<LocalePopulation> BUS = SideEffects.objectValue();

  Locale getLocale();
}
