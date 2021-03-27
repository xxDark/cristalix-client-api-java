package dev.xdark.clientapi.network;

import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.feder.network.Packet;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.UUID;

@SidedApi(Side.SERVER)
public interface ClientConnection {

  void addPlayerInfo(NetworkPlayerInfo info);

  NetworkPlayerInfo getPlayerInfo(UUID uuid);

  NetworkPlayerInfo getPlayerInfo(String name);

  NetworkPlayerInfo removePlayerInfo(UUID uuid);

  NetworkPlayerInfo removePlayerInfo(String name);

  Collection<NetworkPlayerInfo> getPlayerInfos();

  void sendPayload(String channel, ByteBuf buf);

  NetworkPlayerInfo newPlayerInfo(GameProfile profile);

  void fireInboundPacket(Packet packet);
}
