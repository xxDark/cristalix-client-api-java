package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.entity.DataParameter;
import dev.xdark.clientapi.entity.Entity;

public interface EntityDataChange {

  Entity getEntity();

  DataParameter<?> getParameter();
}
