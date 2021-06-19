package dev.xdark.clientapi.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface PacketDirection {

  PacketDirection SERVERBOUND = objectValue(), CLIENTBOUND = objectValue();
}
