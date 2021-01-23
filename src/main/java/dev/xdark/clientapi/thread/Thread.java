package dev.xdark.clientapi.thread;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.lang.Thread.State;

@SidedApi(Side.BOTH)
public interface Thread {

  String getName();

  int getPriority();

  boolean isDaemon();

  State getState();

  boolean isAlive();

  void interrupt();

  void join(long millis);

  void join();

  void start();

  void setName(String name);

  void setPriority(int priority);

  void setDaemon(boolean daemon);

  static void sleep(long millis) throws InterruptedException {
    java.lang.Thread.sleep(millis);
  }

  static void sleep(long millis, int nanos) throws InterruptedException {
    java.lang.Thread.sleep(millis, nanos);
  }
}
