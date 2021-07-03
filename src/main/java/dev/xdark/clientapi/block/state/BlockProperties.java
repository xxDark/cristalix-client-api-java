package dev.xdark.clientapi.block.state;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.material.Material;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.world.BlockAccess;
import dev.xdark.clientapi.block.MapColor;
import dev.xdark.clientapi.block.material.PushReaction;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.math.AxisAlignedBB;
import dev.xdark.clientapi.math.RayTraceResult;
import dev.xdark.clientapi.math.Vec3d;
import dev.xdark.clientapi.util.BlockRenderType;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.util.Mirror;
import dev.xdark.clientapi.util.Rotation;
import dev.xdark.clientapi.world.World;

import java.util.List;

@SidedApi(Side.SERVER)
public interface BlockProperties {

  Material getMaterial();

  boolean isFullBlock();

  int getLightOpacity();

  int getLightValue();

  boolean isTranslucent();

  boolean useNeighborBrightness();

  boolean isFullCube();

  float getAmbientOcclusionLightValue();

  boolean isBlockNormalCube();

  boolean isNormalCube();

  boolean isTopSolid();

  MapColor getMapColor(BlockAccess blockAccess, BlockPos pos);

  BlockState withRotation(Rotation rotation);

  BlockState withMirror(Mirror mirror);

  boolean hasCustomBreakingProgress();

  BlockRenderType getRenderType();

  int getPackedLightmapCoords(BlockAccess blockAccess, int x, int y, int z);

  boolean canProvidePower();

  int getWeakPower(BlockAccess blockAccess, int x, int y, int z, EnumFacing facing);

  boolean hasComparatorInputOverride();

  int getComparatorInputOverride(World world, int x, int y, int z);

  float getBlockHardness(World world, int x, int y, int z);

  float getPlayerRelativeBlockHardness(EntityPlayer player, World world, int x, int y, int z);

  int getStrongPower(BlockAccess blockAccess, int x, int y, int z, EnumFacing facing);

  PushReaction getPushReaction();

  BlockState getActualState(BlockAccess blockAccess, int x, int y, int z);

  AxisAlignedBB getSelectedBoundingBox(World world, int x, int y, int z);

  boolean shouldSideBeRendered(BlockAccess blockAccess, int x, int y, int z, EnumFacing facing);

  boolean isOpaqueCube();

  AxisAlignedBB getCollisionBoundingBox(BlockAccess blockAccess, int x, int y, int z);

  void addCollisionBoxToList(
      World world,
      int x,
      int y,
      int z,
      AxisAlignedBB entityBox,
      List<AxisAlignedBB> collidingBoxes,
      Entity entity,
      boolean isActualState);

  AxisAlignedBB getBoundingBox(BlockAccess blockAccess, int x, int y, int z);

  RayTraceResult collisionRayTrace(World world, int x, int y, int z, Vec3d start, Vec3d end);

  Vec3d getOffset(BlockAccess blockAccess, int x, int y, int z);

  void setOffset(BlockAccess blockAccess, int x, int y, int z, Vec3d into);

  boolean causesSuffocation();

  BlockFaceShape getBlockFaceShape(BlockAccess blockAccess, int x, int y, int z, EnumFacing facing);
}
