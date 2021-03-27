package dev.xdark.clientapi.network.protocol;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.feder.network.Packet;
import dev.xdark.feder.network.ProtocolDirection;

@SidedApi(Side.SERVER)
public interface ConnectionState {

  ConnectionState //HANDSHAKING = objectValue(),
      PLAY = objectValue();
  //LOGIN = objectValue(),
  //STATUS = objectValue();

  int getPacketId(ProtocolDirection direction, Packet packet);

  Packet getPacket(ProtocolDirection direction, int id);

  int getId();
}
