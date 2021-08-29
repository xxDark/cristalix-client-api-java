package dev.xdark.clientapi.text;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public final class TextJSON {

  private TextJSON() {}

  public static String textToJson(Text text) {
    throw CompileStub.create();
  }

  public static Text jsonToText(String json) {
    throw CompileStub.create();
  }

  public static Text fromJsonLenient(String json) {
    throw CompileStub.create();
  }
}
