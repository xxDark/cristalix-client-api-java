package dev.xdark.clientapi.option;

import com.google.gson.JsonElement;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface OptionParser<V> {

	V getDefaultValue();

	JsonElement serialize(V value);

	V deserialize(JsonElement json);
}
