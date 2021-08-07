package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.SERVER)
public interface Option<V> {

	V getValue();

	void setValue(V value);

	Text getName();

	Text getDescription();

	OptionParser<V> getParser();
}
