package dev.xdark.clientapi.network.protocol;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.network.Packet;
import dev.xdark.clientapi.network.PacketDirection;

import java.util.function.Supplier;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface ConnectionState {

  ConnectionState HANDSHAKING = objectValue(),
      PLAY = objectValue(),
      LOGIN = objectValue(),
      STATUS = objectValue();

  int getPacketId(PacketDirection direction, Packet<?> packet);

  Packet<?> getPacket(PacketDirection direction, int id);

  int getId();

  <T extends Packet<?>> void registerPacket(
      PacketDirection direction, int id, Class<T> packet, Supplier<T> supplier);
}
