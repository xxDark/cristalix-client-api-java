package dev.xdark.clientapi.network;

import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.feder.network.Packet;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.UUID;

@SidedApi(Side.BOTH)
public interface ClientConnection {

  @SidedApi(Side.SERVER)
  void addPlayerInfo(NetworkPlayerInfo info);

  NetworkPlayerInfo getPlayerInfo(UUID uuid);

  NetworkPlayerInfo getPlayerInfo(String name);

  @SidedApi(Side.SERVER)
  NetworkPlayerInfo removePlayerInfo(UUID uuid);

  @SidedApi(Side.SERVER)
  NetworkPlayerInfo removePlayerInfo(String name);

  Collection<NetworkPlayerInfo> getPlayerInfos();

  @SidedApi(Side.SERVER)
  void sendPayload(String channel, ByteBuf buf);

  @SidedApi(Side.SERVER)
  NetworkPlayerInfo newPlayerInfo(GameProfile profile);

  @SidedApi(Side.SERVER)
  void fireInboundPacket(Packet packet);
}
