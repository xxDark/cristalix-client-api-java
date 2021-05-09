package dev.xdark.clientapi.internal;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SidedApi(Side.SERVER)
public @interface DumpBytecode {
  String dir() default "";
}
