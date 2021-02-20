package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.particle.Particle;
import dev.xdark.clientapi.util.ParticleType;

@SidedApi(Side.SERVER)
public interface RenderGlobal {

  void loadRenderers();

  Particle spawnParticle(ParticleType type, boolean isLongDistance, double x, double y, double z,
      double motionX, double motionY, double motionZ, int... data);
}
