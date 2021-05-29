package dev.xdark.clientapi.attribute;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public final class StandardAttributes {

  public static final Attribute MAX_HEALTH = objectValue(),
      FOLLOW_RANGE = objectValue(),
      KNOCKBACK_RESISTANCE = objectValue(),
      MOVEMENT_SPEED = objectValue(),
      FLYING_SPEED = objectValue(),
      ATTACK_DAMAGE = objectValue(),
      ATTACK_SPEED = objectValue(),
      ARMOR = objectValue(),
      ARMOR_TOUGHNESS = objectValue(),
      LUCK = objectValue();

  private StandardAttributes() {}
}
