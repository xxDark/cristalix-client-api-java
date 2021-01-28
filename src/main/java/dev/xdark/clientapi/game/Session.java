package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.UUID;

@SidedApi(Side.BOTH)
public interface Session {

  String getName();

  UUID getId();
}
