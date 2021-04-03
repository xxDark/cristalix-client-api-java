package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface SoundEvent {

    static SoundEvent of(ResourceLocation location) {
        throw CompileStub.create();
    }

    ResourceLocation getName();
}
