package dev.xdark.clientapi.util;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ParticleType {

  ParticleType EXPLOSION_NORMAL = objectValue(),
      EXPLOSION_LARGE = objectValue(),
      EXPLOSION_HUGE = objectValue(),
      FIREWORKS_SPARK = objectValue(),
      WATER_BUBBLE = objectValue(),
      WATER_SPLASH = objectValue(),
      WATER_WAKE = objectValue(),
      SUSPENDED = objectValue(),
      SUSPENDED_DEPTH = objectValue(),
      CRIT = objectValue(),
      CRIT_MAGIC = objectValue(),
      SMOKE_NORMAL = objectValue(),
      SMOKE_LARGE = objectValue(),
      SPELL = objectValue(),
      SPELL_INSTANT = objectValue(),
      SPELL_MOB = objectValue(),
      SPELL_MOB_AMBIENT = objectValue(),
      SPELL_WITCH = objectValue(),
      DRIP_WATER = objectValue(),
      DRIP_LAVA = objectValue(),
      VILLAGER_ANGRY = objectValue(),
      VILLAGER_HAPPY = objectValue(),
      TOWN_AURA = objectValue(),
      NOTE = objectValue(),
      PORTAL = objectValue(),
      ENCHANTMENT_TABLE = objectValue(),
      FLAME = objectValue(),
      LAVA = objectValue(),
      FOOTSTEP = objectValue(),
      CLOUD = objectValue(),
      REDSTONE = objectValue(),
      SNOWBALL = objectValue(),
      SNOW_SHOVEL = objectValue(),
      SLIME = objectValue(),
      HEART = objectValue(),
      BARRIER = objectValue(),
      ITEM_CRACK = objectValue(),
      BLOCK_CRACK = objectValue(),
      BLOCK_DUST = objectValue(),
      WATER_DROP = objectValue(),
      ITEM_TAKE = objectValue(),
      MOB_APPEARANCE = objectValue(),
      DRAGON_BREATH = objectValue(),
      END_ROD = objectValue(),
      DAMAGE_INDICATOR = objectValue(),
      SWEEP_ATTACK = objectValue(),
      FALLING_DUST = objectValue(),
      TOTEM = objectValue(),
      SPIT = objectValue();

  int getId();

  String getName();

  boolean ignoresRange();

  int getArgumentCount();
}
