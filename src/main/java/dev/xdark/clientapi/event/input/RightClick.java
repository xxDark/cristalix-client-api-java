package dev.xdark.clientapi.event.input;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.ActionResult;
import dev.xdark.clientapi.util.EnumHand;

@SidedApi(Side.SERVER)
public interface RightClick {
  EnumHand getHand();

  ActionResult getResult();

  void setResult(ActionResult result);
}
