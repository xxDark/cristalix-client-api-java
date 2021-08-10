package dev.xdark.clientapi.option.client;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.optlibrary.BooleanOption;
import dev.xdark.optlibrary.FloatOption;
import dev.xdark.optlibrary.IntOption;
import dev.xdark.optlibrary.Option;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public final class ClientOptions {

  public static final BooleanOption INVERT_MOUSE = objectValue();
  public static final FloatOption SENSITIVITY = objectValue();
  public static final FloatOption FOV = objectValue();
  public static final FloatOption GAMMA = objectValue();
  public static final IntOption RENDER_DISTANCE = objectValue();
  public static final BooleanOption VIEW_BOBBING = objectValue();
  public static final BooleanOption ANAGLYPH = objectValue();
  public static final IntOption FPS = objectValue();
  public static final BooleanOption FBO = objectValue();
  public static final Option<CloudRender> CLOUD_RENDER = objectValue();
  public static final Option<VisualQuality> VISUAL_QUALITY = objectValue();
  public static final Option<AmbientOcclusion> AMBIENT_OCCLUSION = objectValue();
  public static final Option<ScreenScale> SCREEN_SCALE = objectValue();
  public static final Option<ParticleVisibility> PARTICLE_VISIBILITY = objectValue();

  // TODO

  private ClientOptions() {}
}
