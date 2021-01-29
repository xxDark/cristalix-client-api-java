package dev.xdark.clientapi.system;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface Clipboard {

  void setContent(String content);
}
