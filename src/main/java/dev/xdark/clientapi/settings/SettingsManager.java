package dev.xdark.clientapi.settings;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@Deprecated
@SidedApi(Side.BOTH)
public interface SettingsManager {

  KeyBinding getBindingByCode(int code);

  KeyBinding getBindingByName(String name);
}
