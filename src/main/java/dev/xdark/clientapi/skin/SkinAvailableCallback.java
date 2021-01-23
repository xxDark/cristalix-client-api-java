package dev.xdark.clientapi.skin;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
@FunctionalInterface
public interface SkinAvailableCallback {

  void skinAvailable(Type type, ResourceLocation location, MinecraftProfileTexture texture);
}
