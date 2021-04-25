package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface EntityLightningBolt extends EntityWeatherEffect {

  int getState();

  void setState(int state);

  long getBoltVertex();

  void setBoltVertex(long boltVertex);

  int getBoltLivingTime();

  void setBoltLivingTime(int boltLivingTime);
}
