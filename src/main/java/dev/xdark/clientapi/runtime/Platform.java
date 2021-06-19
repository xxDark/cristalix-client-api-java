package dev.xdark.clientapi.runtime;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.Objects;

@SidedApi(Side.BOTH)
public final class Platform {

  private final String name;
  private final String version;
  private final String arch;

  public Platform(String name, String version, String arch) {
    this.name = name;
    this.version = version;
    this.arch = arch;
  }

  public String getName() {
    return name;
  }

  public String getVersion() {
    return version;
  }

  public String getArch() {
    return arch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Platform platform = (Platform) o;

    if (!name.equals(platform.name)) return false;
    if (!version.equals(platform.version)) return false;
    return arch.equals(platform.arch);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + version.hashCode();
    result = 31 * result + arch.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Platform{"
        + "name='"
        + name
        + '\''
        + ", version='"
        + version
        + '\''
        + ", arch='"
        + arch
        + '\''
        + '}';
  }
}
