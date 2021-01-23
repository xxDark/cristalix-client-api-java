package dev.xdark.clientapi.js;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.io.Reader;
import javax.script.CompiledScript;
import javax.script.ScriptException;

@SidedApi(Side.SERVER)
public interface Compiler {

  CompiledScript compile(String source) throws ScriptException;

  CompiledScript compile(Reader reader) throws ScriptException;
}
