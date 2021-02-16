package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.DataParameter;
import dev.xdark.clientapi.entity.Entity;

@SidedApi(Side.SERVER)
public interface EntityDataChange {

  Entity getEntity();

  DataParameter<?> getParameter();
}
