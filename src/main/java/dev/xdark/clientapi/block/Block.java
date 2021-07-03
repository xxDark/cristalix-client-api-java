package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.handler.*;
import dev.xdark.clientapi.block.material.MapColor;
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
import dev.xdark.clientapi.renderer.color.BlockColor;
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

  BlockRenderType getRenderType(BlockState state);

  boolean isReplaceable(BlockAccess blockAccess, BlockPos pos);

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

  boolean onBlockActivated(
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
      float hitZ);

  void onEntityWalk(World world, int x, int y, int z, Entity entity);

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

  void onBlockClicked(World world, int x, int y, int z, EntityPlayer player);

  Vec3d modifyAcceleration(World world, int x, int y, int z, Entity entity, Vec3d acceleration);

  void onEntityCollision(World world, int x, int y, int z, BlockState state, Entity entity);

  boolean canProvidePower(BlockState state);

  int getWeakPower(
      BlockState state, BlockAccess blockAccess, int x, int y, int z, EnumFacing facing);

  int getStrongPower(
      BlockState state, BlockAccess blockAccess, int x, int y, int z, EnumFacing facing);

  void onBlockPlacedBy(
      World world, BlockPos pos, BlockState state, EntityLivingBase entity, ItemStack stack);

  boolean eventReceived(BlockState state, World world, int x, int y, int z, int id, int param);

  PushReaction getPushReaction(BlockState state);

  float getAmbientOcclusionLightValue(BlockState state);

  void onFallenUpon(World world, int x, int y, int z, Entity entity, float fallDistance);

  void onLanded(World world, Entity entity);

  ItemStack getItem(World world, int x, int y, int z, BlockState state);

  void getSubBlocks(CreativeTab tab, List<ItemStack> stacks);

  CreativeTab getCreativeTab();

  void onBlockHarvested(World world, BlockPos pos, BlockState state, EntityPlayer player);

  boolean hasComparatorInputOverride(BlockState state);

  int getComparatorInputOverride(BlockState state, World world, int x, int y, int z);

  BlockStateContainer createBlockState();

  BlockStateContainer getBlockState();

  OffsetType getOffsetType();

  Vec3d getOffset(BlockState state, BlockAccess blockAccess, int x, int y, int z);

  void addInformation(ItemStack stack, World world, List<String> info, TooltipFlag tooltipFlag);

  Material getMaterial();

  float getBaseHardness();

  float getSlipperiness();

  float getParticleGravity();

  void onPlayerDestroy(World world, BlockPos pos, BlockState state);

  SoundType getSoundType();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder hasTileEntity(boolean hasTileEntity);

    Builder translationKey(String translationKey);

    Builder offsetType(OffsetType offsetType);

    Builder material(Material material);

    Builder tickRandomly(boolean tickRandomly);

    Builder blockRenderLayer(BlockRenderLayer blockRenderLayer);

    Builder creativeTab(CreativeTab creativeTab);

    Builder blockColor(BlockColor blockColor);

    Builder blockColorMultiplier(BlockColor blockColor);

    Builder soundType(SoundType soundType);

    Builder baseHardness(float baseHardness);

    Builder slipperiness(float slipperiness);

    Builder particleGravity(float particleGravity);

    Builder metaHandler(MetaHandler metaHandler);

    Builder solidTopHandler(SolidTopHandler solidTopHandler);

    Builder fullBlockHandler(FullBlockHandler fullBlockHandler);

    Builder lightOpacityHandler(LightOpacityHandler lightOpacityHandler);

    Builder translucentHandler(TranslucentHandler translucentHandler);

    Builder lightValueHandler(LightValueHandler lightValueHandler);

    Builder neighborBrightnessHandler(NeighborBrightnessHandler neighborBrightnessHandler);

    Builder materialHandler(MaterialHandler materialHandler);

    Builder mapColorHandler(MapColorHandler mapColorHandler);

    Builder actualStateHandler(ActualStateHandler actualStateHandler);

    Builder rotationHandler(RotationHandler rotationHandler);

    Builder mirrorHandler(MirrorHandler mirrorHandler);

    Builder suffocationHandler(SuffocationHandler suffocationHandler);

    Builder fullCubeHandler(FullCubeHandler fullCubeHandler);

    Builder customBreakingProgressHandler(
        CustomBreakingProgressHandler customBreakingProgressHandler);

    Builder passHandler(PassHandler passHandler);

    Builder renderTypeHandler(RenderTypeHandler renderTypeHandler);

    Builder replaceHandler(ReplaceHandler replaceHandler);

    Builder blockHardnessHandler(BlockHardnessHandler blockHardnessHandler);

    Builder boundingBoxHandler(BoundingBoxHandler boundingBoxHandler);

    Builder lightmapCoordsHandler(LightmapCoordsHandler lightmapCoordsHandler);

    Builder sideRenderHandler(SideRenderHandler sideRenderHandler);

    Builder faceShapeHandler(FaceShapeHandler faceShapeHandler);

    Builder selectedBoundingBoxHandler(SelectedBoundingBoxHandler selectedBoundingBoxHandler);

    Builder collisionBoxListHandler(CollisionBoxListHandler collisionBoxListHandler);

    Builder collisionBoundingBoxHandler(CollisionBoundingBoxHandler collisionBoundingBoxHandler);

    Builder opaqueCubeHandler(OpaqueCubeHandler opaqueCubeHandler);

    Builder collideCheckHandler(CollideCheckHandler collideCheckHandler);

    Builder collidableHandler(CollidableHandler collidableHandler);

    Builder displayTickHandler(DisplayTickHandler displayTickHandler);

    Builder tickRateHandler(TickRateHandler tickRateHandler);

    Builder playerRelativeHardnessHandler(
        PlayerRelativeHardnessHandler playerRelativeHardnessHandler);

    Builder droppedDamageHandler(DroppedDamageHandler droppedDamageHandler);

    Builder collisionRayTraceHandler(CollisionRayTraceHandler collisionRayTraceHandler);

    Builder sidePlacementHandler(SidePlacementHandler sidePlacementHandler);

    Builder blockPlacementCheckHandler(BlockPlacementCheckHandler blockPlacementCheckHandler);

    Builder blockActivationHandler(BlockActivationHandler blockActivationHandler);

    Builder entityWalkHandler(EntityWalkHandler entityWalkHandler);

    Builder statePlacementHandler(StatePlacementHandler statePlacementHandler);

    Builder blockClickHandler(BlockClickHandler blockClickHandler);

    Builder accelerationModificationHandler(
        AccelerationModificationHandler accelerationModificationHandler);

    Builder weakPowerHandler(WeakPowerHandler weakPowerHandler);

    Builder powerProvideCheckHandler(PowerProvideCheckHandler powerProvideCheckHandler);

    Builder entityCollisionHandler(EntityCollisionHandler entityCollisionHandler);

    Builder strongPowerHandler(StrongPowerHandler strongPowerHandler);

    Builder blockPlacedHandler(BlockPlacedHandler blockPlacedHandler);

    Builder eventReceiveHandler(EventReceiveHandler eventReceiveHandler);

    Builder pushReactionHandler(PushReactionHandler pushReactionHandler);

    Builder ambientOcclusionLightValueHandler(
        AmbientOcclusionLightValueHandler ambientOcclusionLightValueHandler);

    Builder entityFallenHandler(EntityFallenHandler entityFallenHandler);

    Builder entityLandHandler(EntityLandHandler entityLandHandler);

    Builder itemHandler(ItemHandler itemHandler);

    Builder subBlocksHandler(SubBlocksHandler subBlocksHandler);

    Builder blockHarvestHandler(BlockHarvestHandler blockHarvestHandler);

    Builder comparatorInputOverrideCheckHandler(
        ComparatorInputOverrideCheckHandler comparatorInputOverrideCheckHandler);

    Builder comparatorInputOverrideHandler(
        ComparatorInputOverrideHandler comparatorInputOverrideHandler);

    Builder blockStateCreator(BlockStateCreator blockStateCreator);

    Builder informationHandler(InformationHandler informationHandler);

    Builder playerDestroyHandler(PlayerDestroyHandler playerDestroyHandler);

    Block build();
  }
}
