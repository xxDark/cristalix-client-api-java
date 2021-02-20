package dev.xdark.clientapi.network.protocol;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ConnectionState {

  ConnectionState //HANDSHAKING = objectValue(),
      PLAY = objectValue();
  //LOGIN = objectValue(),
  //STATUS = objectValue();

  int getPacketId(PacketDirection direction, Packet packet);

  Packet getPacket(PacketDirection direction, int id);

  int getId();

  @SidedApi(Side.SERVER)
  interface PacketDirection {

    PacketDirection CLIENTBOUND = objectValue(),
        SERVERBOUND = objectValue();
  }
}
