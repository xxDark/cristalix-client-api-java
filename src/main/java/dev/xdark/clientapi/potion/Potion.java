package dev.xdark.clientapi.potion;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Potion {

  int getId();

  boolean isInstant();

  String getName();

  boolean hasStatusIcon();

  int getStatusIconIndex();

  boolean isBadEffect();

  int getLiquidColor();

  boolean isBeneficial();

  PotionEffect newEffect(int duration, int amplifier, boolean ambient, boolean showParticles);
}
