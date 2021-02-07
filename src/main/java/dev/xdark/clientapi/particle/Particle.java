package dev.xdark.clientapi.particle;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Particle {

  Particle multiplyVelocity(float v);

  Particle multiplyScaleBy(float v);

  void setColor(float r, float g, float b, float a);

  float getRed();

  float getGreen();

  float getBlue();

  float getAlpha();

  void setMaxAge(int maxAge);

  void setExpired();

  void setSize(float w, float h);

  void setPosition(double x, double y, double z);

  void move(double x, double y, double z);

  boolean isAlive();
}
