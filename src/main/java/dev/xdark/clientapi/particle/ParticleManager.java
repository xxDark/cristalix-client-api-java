package dev.xdark.clientapi.particle;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.ParticleType;

@SidedApi(Side.SERVER)
public interface ParticleManager {

  Particle spawnEffectParticle(ParticleType type, double xCoord, double yCoord, double zCoord,
      double xSpeed, double ySpeed, double zSpeed, int... parameters);
}
