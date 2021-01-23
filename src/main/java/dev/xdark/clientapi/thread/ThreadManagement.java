package dev.xdark.clientapi.thread;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@SidedApi(Side.BOTH)
public interface ThreadManagement {

  Thread newThread(Runnable runnable);

  Thread newThread(String name, int priority, Runnable runnable);

  ExecutorService newCachedThreadPool();

  ExecutorService newSingleThreadedExecutor();

  ScheduledExecutorService newSingleThreadedScheduledExecutor();

  ScheduledExecutorService newScheduledThreadPool(int coreThreads);

  Collection<Thread> activeThreads();

  boolean inMainThread();
}
