package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface SoundListener {

    void soundPlay(SoundRequest sound);

    void soundStop(SoundRequest sound);
}
