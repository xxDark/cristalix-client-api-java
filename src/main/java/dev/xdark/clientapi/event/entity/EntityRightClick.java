package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.math.RayTraceResult;
import dev.xdark.clientapi.util.ActionResult;
import dev.xdark.clientapi.util.EnumHand;

@SidedApi(Side.SERVER)
public interface EntityRightClick {
  Entity getTarget();

  RayTraceResult getRayTraceResult();

  EnumHand getHand();

  ActionResult getResult();

  void setResult(ActionResult result);
}
