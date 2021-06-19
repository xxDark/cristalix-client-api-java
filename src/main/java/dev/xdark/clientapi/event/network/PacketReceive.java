package dev.xdark.clientapi.event.network;

import dev.xdark.feder.network.Packet;

public interface PacketReceive<P extends Packet> {

    P getPacket();
}
