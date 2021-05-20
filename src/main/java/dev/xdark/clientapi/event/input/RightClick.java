package dev.xdark.clientapi.event.input;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.ActionResult;
import dev.xdark.clientapi.util.EnumHand;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface RightClick {

  EventBus<RightClick> BUS = SideEffects.objectValue();

  EnumHand getHand();

  ActionResult getResult();

  void setResult(ActionResult result);
}
