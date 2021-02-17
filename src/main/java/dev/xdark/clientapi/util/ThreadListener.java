package dev.xdark.clientapi.util;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.concurrent.Future;

@SidedApi(Side.BOTH)
public interface ThreadListener {

  Future<?> addScheduledTask(Runnable command);

  boolean isCallingFromMainThread();
}
