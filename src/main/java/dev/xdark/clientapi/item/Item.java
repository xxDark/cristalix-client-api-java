package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.gui.CreativeTab;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

import java.util.UUID;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface Item {
  UUID ATTACK_DAMAGE_MODIFIER = objectValue(), ATTACK_SPEED_MODIFIER = objectValue();

  static Item of(int id) {
    throw CompileStub.create();
  }

  static Item of(String idOrLocation) {
    throw CompileStub.create();
  }

  ResourceLocation getLocation();

  int getId();

  boolean hasCustomProperties();

  int getItemStackLimit();

  boolean hasSubtypes();

  int getMaxDamage();

  boolean isDamageable();

  boolean isFull3D();

  boolean shouldRotateAroundWhenRendering();

  String getTranslationKey();

  String getTranslationKey(ItemStack stack);

  Item getContainerItem();

  ItemStack newStack(int amount, int damage);

  ItemProperty getPropertyOverride(ResourceLocation location);

  float getDestroySpeed(ItemStack stack, BlockState state);

  int getMetadata(int i);

  boolean canHarvestBlock(BlockState state);

  boolean hasContainerItem();

  UseAction getUseAction(ItemStack stack);

  int getMaxUseDuration(ItemStack stack);

  boolean hasEffect(ItemStack stack);

  Rarity getRarity(ItemStack stack);

  boolean isEnchantable(ItemStack stack);

  CreativeTab getCreativeTab();

  boolean isRepairable(ItemStack toRepair, ItemStack repair);

  int getEnchantability();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder destroyHandler(BlockDestroyHandler destroyHandler);

    Builder harvestHandler(BlockHarvestHandler harvestHandler);

    Builder hitHandler(EntityHitHandler hitHandler);

    Builder interactHandler(EntityInteractHandler interactHandler);

    Builder stoppedUsingHandler(EntityStoppedUsingHandler stoppedUsingHandler);

    Builder createHandler(ItemCreateHandler createHandler);

    Builder informationHandler(ItemInformationHandler informationHandler);

    Builder rightClickHandler(ItemRightClickHandler rightClickHandler);

    Builder useHandler(ItemUseHandler useHandler);

    Builder useFinishHandler(ItemUseFinishHandler useFinishHandler);

    Builder useActionHandler(ItemUseActionHandler useActionHandler);

    Builder destroySpeedHandler(BlockDestroySpeedHandler destroySpeedHandler);

    Builder metadataHandler(ItemMetadataHandler metadataHandler);

    Builder effectHandler(ItemEffectHandler effectHandler);

    Builder rarityHandler(ItemRarityHandler rarityHandler);

    Builder enchantHandler(ItemEnchantHandler enchantHandler);

    Builder attributeHandler(ItemAttributeHandler attributeHandler);

    Builder repairHandler(ItemRepairHandler repairHandler);

    Builder creativeTab(CreativeTab creativeTab);

    Builder property(ResourceLocation location, ItemProperty property);

    Builder maxStackSize(int maxStackSize);

    Builder hasSubtypes(boolean hasSubtypes);

    Builder maxDamage(int maxDamage);

    Builder full3d(boolean full3d);

    Builder rotateAroundWhenRendering(boolean rotateAroundWhenRendering);

    Builder containerItem(Item item);

    Builder translationKey(String translationKey);

    Item build();
  }
}
