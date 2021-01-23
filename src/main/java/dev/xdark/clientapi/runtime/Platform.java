package dev.xdark.clientapi.runtime;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.Objects;

@SidedApi(Side.BOTH)
public final class Platform {

  private final String name;
  private final String version;

  public Platform(String name, String version) {
    this.name = name;
    this.version = version;
  }

  public String getName() {
    return name;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Platform)) {
      return false;
    }

    Platform platform = (Platform) o;

    if (!Objects.equals(name, platform.name)) {
      return false;
    }
    return Objects.equals(version, platform.version);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (version != null ? version.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Platform{" +
        "name='" + name + '\'' +
        ", version='" + version + '\'' +
        '}';
  }
}
