package dev.xdark.clientapi.potion;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface PotionEffect extends Comparable<PotionEffect> {

  Potion getPotion();

  int getDuration();

  int getAmplifier();

  boolean isAmbient();

  boolean doesShowParticles();

  @Override
  int compareTo(PotionEffect o);
}
