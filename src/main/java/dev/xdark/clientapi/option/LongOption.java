package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface LongOption extends Option<Long> {

	long getLongValue();

	void setLongValue(long value);
}
