package dev.xdark.clientapi.util;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.function.Predicate;

@SidedApi(Side.BOTH)
public interface EnumFacing {

  EnumFacing DOWN = objectValue(),
      UP = objectValue(),
      NORTH = objectValue(),
      SOUTH = objectValue(),
      WEST = objectValue(),
      EAST = objectValue();

  int getIndex();

  int getHorizontalIndex();

  AxisDirection getAxisDirection();

  EnumFacing getOpposite();

  EnumFacing rotateAround(Axis axis);

  EnumFacing rotateX();

  EnumFacing rotateY();

  EnumFacing rotateZ();

  EnumFacing rotateYCCW();

  int getXOffset();

  int getYOffset();

  int getZOffset();

  String getName();

  Axis getAxis();

  @SidedApi(Side.BOTH)
  interface Axis extends Predicate<EnumFacing> {

    Axis X = objectValue(),
        Y = objectValue(),
        Z = objectValue();

    String getName();

    boolean isVertical();

    boolean isHorizontal();

    Plane getPlane();
  }

  @SidedApi(Side.BOTH)
  interface AxisDirection {

    AxisDirection POSITIVE = objectValue(),
        NEGATIVE = objectValue();

    int getOffset();
  }

  @SidedApi(Side.BOTH)
  interface Plane extends Predicate<EnumFacing>, Iterable<EnumFacing> {

    Plane HORIZONTAL = objectValue(),
        VERTICAL = objectValue();

    EnumFacing[] facings();
  }
}
