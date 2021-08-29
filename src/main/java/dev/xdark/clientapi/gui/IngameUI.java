package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface IngameUI {

  ChatOverlay getDefaultChatOverlay();

  ChatOverlay getChatOverlay();

  void setChatOverlay(ChatOverlay chatOverlay);
}
