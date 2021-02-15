package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityLivingBase;

@SidedApi(Side.SERVER)
public interface LivingUpdate {

  EntityLivingBase getEntity();
}
