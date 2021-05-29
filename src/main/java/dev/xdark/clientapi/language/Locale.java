package dev.xdark.clientapi.language;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Locale {

    boolean isUnicode();

    String getTranslation(String key);

    String formatMessage(String message, Object... args);

    boolean hasKey(String key);

    void register(String key, String translation);
}
