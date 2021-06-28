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
import dev.xdark.clientapi.gui.CreativeTab;
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

  default int getId() {
    throw CompileStub.create();
  }

  default ResourceLocation getLocation() {
    throw CompileStub.create();
  }

  default BlockState getDefaultState() {
    throw CompileStub.create();
  }

  default BlockState getStateFromMeta(int meta) {
    throw CompileStub.create();
  }

  default int getMetaFromState(BlockState state) {
    throw CompileStub.create();
  }

  default boolean hasTileEntity() {
    throw CompileStub.create();
  }

  default String getLocalizedName() {
    throw CompileStub.create();
  }

  default String getTranslationKey() {
    throw CompileStub.create();
  }

  default boolean isTopSolid(BlockState state) {
    throw CompileStub.create();
  }

  default boolean isFullBlock(BlockState state) {
    throw CompileStub.create();
  }

  default int getLightOpacity(BlockState state) {
    throw CompileStub.create();
  }

  default boolean isTranslucent(BlockState state) {
    throw CompileStub.create();
  }

  default int getLightValue(BlockState state) {
    throw CompileStub.create();
  }

  default boolean getUseNeighborBrightness(BlockState state) {
    throw CompileStub.create();
  }

  default Material getMaterial(BlockState state) {
    throw CompileStub.create();
  }

  default MapColor getMapColor(BlockState state, BlockAccess blockAccess, BlockPos pos) {
    throw CompileStub.create();
  }

  default BlockState getActualState(
      BlockState state, BlockAccess blockAccess, int x, int y, int z) {
    throw CompileStub.create();
  }

  default BlockState withRotation(BlockState state, Rotation rotation) {
    throw CompileStub.create();
  }

  default BlockState withMirror(BlockState state, Mirror mirror) {
    throw CompileStub.create();
  }

  default boolean isBlockNormalCube(BlockState state) {
    throw CompileStub.create();
  }

  default boolean isNormalCube(BlockState state) {
    throw CompileStub.create();
  }

  default boolean causesSuffocation(BlockState state) {
    throw CompileStub.create();
  }

  default boolean isFullCube(BlockState state) {
    throw CompileStub.create();
  }

  default boolean hasCustomBreakingProgress(BlockState state) {
    throw CompileStub.create();
  }

  default boolean isPassable(BlockAccess blockAccess, int x, int y, int z) {
    throw CompileStub.create();
  }

  default BlockRenderType getRenderType(BlockState state) {
    throw CompileStub.create();
  }

  default boolean isReplaceable(BlockAccess blockAccess, BlockPos pos) {
    throw CompileStub.create();
  }

  default float getBlockHardness(BlockState state, World world, int x, int y, int z) {
    throw CompileStub.create();
  }

  default boolean tickRandomly() {
    throw CompileStub.create();
  }

  default AxisAlignedBB getBoundingBox(
      BlockState state, BlockAccess blockAccess, int x, int y, int z) {
    throw CompileStub.create();
  }

  default int getPackedLightmapCoords(
      BlockState state, BlockAccess blockAccess, int x, int y, int z) {
    throw CompileStub.create();
  }

  default boolean shouldSideBeRendered(
      BlockState state, BlockAccess blockAccess, int x, int y, int z, EnumFacing facing) {
    throw CompileStub.create();
  }

  default BlockFaceShape getBlockFaceShape(
      BlockAccess blockAccess, BlockState state, int x, int y, int z, EnumFacing facing) {
    throw CompileStub.create();
  }

  default AxisAlignedBB getSelectedBoundingBox(
      BlockState blockState, World world, int x, int y, int z) {
    throw CompileStub.create();
  }

  default void addCollisionBoxToList(
      BlockState state,
      World world,
      int x,
      int y,
      int z,
      AxisAlignedBB entityBox,
      List<AxisAlignedBB> collidingBoxes,
      Entity entity,
      boolean isActualState) {
    throw CompileStub.create();
  }

  static void addCollisionBoxToList(
      int x,
      int y,
      int z,
      AxisAlignedBB entityBox,
      List<AxisAlignedBB> boxes,
      AxisAlignedBB blockBox) {
    throw CompileStub.create();
  }

  default AxisAlignedBB getCollisionBoundingBox(
      BlockState state, BlockAccess blockAccess, int x, int y, int z) {
    throw CompileStub.create();
  }

  default boolean isOpaqueCube(BlockState state) {
    throw CompileStub.create();
  }

  default boolean canCollideCheck(BlockState state, boolean hitIfLiquid) {
    throw CompileStub.create();
  }

  default boolean isCollidable() {
    throw CompileStub.create();
  }

  default void randomDisplayTick(
      BlockState blockState, World world, int x, int y, int z, Random random) {
    throw CompileStub.create();
  }

  default int tickRate(World world) {
    throw CompileStub.create();
  }

  float getPlayerRelativeBlockHardness(
      BlockState state, EntityPlayer player, World world, int x, int y, int z);

  default int damageDropped(BlockState state) {
    throw CompileStub.create();
  }

  default RayTraceResult collisionRayTrace(
      BlockState blockState, World world, int x, int y, int z, Vec3d start, Vec3d end) {
    throw CompileStub.create();
  }

  default BlockRenderLayer getRenderLayer() {
    throw CompileStub.create();
  }

  default boolean canPlaceBlockOnSide(World world, int x, int y, int z, EnumFacing facing) {
    throw CompileStub.create();
  }

  default boolean canPlaceBlockAt(World world, int x, int y, int z) {
    throw CompileStub.create();
  }

  default boolean onBlockActivated(
      World world,
      int x,
      int y,
      int z,
      BlockState state,
      EntityPlayer player,
      EnumHand hand,
      EnumFacing side,
      float hitX,
      float hitY,
      float hitZ) {
    throw CompileStub.create();
  }

  default void onEntityWalk(World world, int x, int y, int z, Entity entity) {
    throw CompileStub.create();
  }

  default BlockState getStateForPlacement(
      World world,
      int x,
      int y,
      int z,
      EnumFacing facing,
      float hitX,
      float hitY,
      float hitZ,
      int meta,
      EntityLivingBase placer) {
    throw CompileStub.create();
  }

  default void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
    throw CompileStub.create();
  }

  default Vec3d modifyAcceleration(
      World world, int x, int y, int z, Entity entity, Vec3d acceleration) {
    throw CompileStub.create();
  }

  default int getWeakPower(
      BlockState state, BlockAccess blockAccess, int x, int y, int z, EnumFacing facing) {
    throw CompileStub.create();
  }

  default boolean canProvidePower(BlockState state) {
    throw CompileStub.create();
  }

  default void onEntityCollision(
      World world, int x, int y, int z, BlockState state, Entity entity) {
    throw CompileStub.create();
  }

  default int getStrongPower(
      BlockState state, BlockAccess blockAccess, int x, int y, int z, EnumFacing facing) {
    throw CompileStub.create();
  }

  default void onBlockPlacedBy(
      World world, BlockPos pos, BlockState state, EntityLivingBase entity, ItemStack stack) {
    throw CompileStub.create();
  }

  default boolean eventReceived(
      BlockState state, World world, int x, int y, int z, int id, int param) {
    throw CompileStub.create();
  }

  default PushReaction getPushReaction(BlockState state) {
    throw CompileStub.create();
  }

  default float getAmbientOcclusionLightValue(BlockState state) {
    throw CompileStub.create();
  }

  default void onFallenUpon(World world, int x, int y, int z, Entity entity, float fallDistance) {
    throw CompileStub.create();
  }

  default void onLanded(World world, Entity entity) {
    throw CompileStub.create();
  }

  default ItemStack getItem(World world, int x, int y, int z, BlockState state) {
    throw CompileStub.create();
  }

  default void getSubBlocks(CreativeTab tab, List<ItemStack> stacks) {
    throw CompileStub.create();
  }

  default CreativeTab getCreativeTab() {
    throw CompileStub.create();
  }

  default void onBlockHarvested(World world, BlockPos pos, BlockState state, EntityPlayer player) {
    throw CompileStub.create();
  }

  default boolean hasComparatorInputOverride(BlockState state) {
    throw CompileStub.create();
  }

  default int getComparatorInputOverride(BlockState state, World world, int x, int y, int z) {
    throw CompileStub.create();
  }

  default BlockStateContainer createBlockState() {
    throw CompileStub.create();
  }

  default BlockStateContainer getBlockState() {
    throw CompileStub.create();
  }

  default OffsetType getOffsetType() {
    throw CompileStub.create();
  }

  default Vec3d getOffset(BlockState state, BlockAccess blockAccess, int x, int y, int z) {
    throw CompileStub.create();
  }

  default void addInformation(
      ItemStack stack, World world, List<String> info, TooltipFlag tooltipFlag) {
    throw CompileStub.create();
  }
}
