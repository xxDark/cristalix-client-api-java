package dev.xdark.clientapi.p13n;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.internal.Unstable;

import java.util.UUID;

@Unstable
@SidedApi(Side.SERVER)
public interface P13nProvider {

  boolean enableModel(EntityPlayer player, UUID model);

  boolean disableModel(EntityPlayer player, UUID model);

  boolean playEmotion(EntityPlayer player, UUID emotion, String data, boolean override);

  boolean stopEmotion(EntityPlayer player, UUID emotion);

  void tickEmotion(EntityPlayer player);
}
