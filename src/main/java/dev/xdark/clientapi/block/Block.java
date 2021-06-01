package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.material.Material;
import dev.xdark.clientapi.block.material.PushReaction;
import dev.xdark.clientapi.block.state.BlockFaceShape;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.block.state.BlockStateContainer;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.item.TooltipFlag;
import dev.xdark.clientapi.math.AxisAlignedBB;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.math.RayTraceResult;
import dev.xdark.clientapi.math.Vec3d;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.*;
import dev.xdark.clientapi.world.BlockAccess;
import dev.xdark.clientapi.world.World;

import java.util.List;
import java.util.Random;

@SidedApi(Side.SERVER)
public interface Block {

  static Block of(int id) {
    throw CompileStub.create();
  }

  static Block of(String idOrLocation) {
    throw CompileStub.create();
  }

  int getId();

  ResourceLocation getLocation();

  BlockState getDefaultState();

  BlockState getStateFromMeta(int meta);

  int getMetaFromState(BlockState state);

  boolean hasTileEntity();

  String getLocalizedName();

  String getTranslationKey();

  boolean isTopSolid(BlockState state);

  boolean isFullBlock(BlockState state);

  int getLightOpacity(BlockState state);

  boolean isTranslucent(BlockState state);

  int getLightValue(BlockState state);

  boolean getUseNeighborBrightness(BlockState state);

  Material getMaterial(BlockState state);

  MapColor getMapColor(BlockState state, BlockAccess blockAccess, BlockPos pos);

  BlockState getActualState(BlockState state, BlockAccess blockAccess, int x, int y, int z);

  BlockState withRotation(BlockState state, Rotation rotation);

  BlockState withMirror(BlockState state, Mirror mirror);

  boolean isBlockNormalCube(BlockState state);

  boolean isNormalCube(BlockState state);

  boolean causesSuffocation(BlockState state);

  boolean isFullCube(BlockState state);

  boolean hasCustomBreakingProgress(BlockState state);

  boolean isPassable(BlockAccess blockAccess, int x, int y, int z);

  float getBlockHardness(BlockState state, World world, int x, int y, int z);

  boolean tickRandomly();

  AxisAlignedBB getBoundingBox(BlockState state, BlockAccess blockAccess, int x, int y, int z);

  int getPackedLightmapCoords(BlockState state, BlockAccess blockAccess, int x, int y, int z);

  boolean shouldSideBeRendered(
      BlockState state, BlockAccess blockAccess, int x, int y, int z, EnumFacing facing);

  BlockFaceShape getBlockFaceShape(
      BlockAccess blockAccess, BlockState state, int x, int y, int z, EnumFacing facing);

  AxisAlignedBB getSelectedBoundingBox(BlockState blockState, World world, int x, int y, int z);

  void addCollisionBoxToList(
      BlockState state,
      World world,
      int x,
      int y,
      int z,
      AxisAlignedBB entityBox,
      List<AxisAlignedBB> collidingBoxes,
      Entity entity,
      boolean isActualState);

  static void addCollisionBoxToList(
      int x,
      int y,
      int z,
      AxisAlignedBB entityBox,
      List<AxisAlignedBB> boxes,
      AxisAlignedBB blockBox) {
    throw CompileStub.create();
  }

  AxisAlignedBB getCollisionBoundingBox(
      BlockState state, BlockAccess blockAccess, int x, int y, int z);

  boolean isOpaqueCube(BlockState state);

  boolean canCollideCheck(BlockState state, boolean hitIfLiquid);

  boolean isCollidable();

  void randomDisplayTick(BlockState blockState, World world, int x, int y, int z, Random random);

  int tickRate(World world);

  float getPlayerRelativeBlockHardness(
      BlockState state, EntityPlayer player, World world, int x, int y, int z);

  int damageDropped(BlockState state);

  RayTraceResult collisionRayTrace(
      BlockState blockState, World world, int x, int y, int z, Vec3d start, Vec3d end);

  BlockRenderLayer getRenderLayer();

  boolean canPlaceBlockOnSide(World world, int x, int y, int z, EnumFacing facing);

  boolean canPlaceBlockAt(World world, int x, int y, int z);

  BlockState getStateForPlacement(
      World world,
      int x,
      int y,
      int z,
      EnumFacing facing,
      float hitX,
      float hitY,
      float hitZ,
      int meta,
      EntityLivingBase placer);

  Vec3d modifyAcceleration(World world, int x, int y, int z, Entity entity, Vec3d acceleration);

  PushReaction getPushReaction(BlockState state);

  float getAmbientOcclusionLightValue(BlockState state);

  ItemStack getItem(World world, int x, int y, int z, BlockState state);

  BlockStateContainer getBlockState();

  OffsetType getOffsetType();

  Vec3d getOffset(BlockState state, BlockAccess blockAccess, int x, int y, int z);

  void addInformation(ItemStack stack, World world, List<String> info, TooltipFlag tooltipFlag);
}
