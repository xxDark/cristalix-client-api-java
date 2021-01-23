package dev.xdark.clientapi.skin;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import java.util.Map;

@SidedApi(Side.SERVER)
public interface SkinManager {

  ResourceLocation loadSkin(MinecraftProfileTexture texture, Type type,
      SkinAvailableCallback callback);

  Map<Type, MinecraftProfileTexture> loadSkinFromCache(GameProfile profile);
}
