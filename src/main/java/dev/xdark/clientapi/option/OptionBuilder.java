package dev.xdark.clientapi.option;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.SERVER)
public interface OptionBuilder<V, O extends Option<V>, SELF extends OptionBuilder<V, O, SELF>> {

  SELF name(Text name);

  SELF description(Text description);

  SELF parser(OptionParser<V> parser);

  SELF delegate(Option<V> delegate);

  O build();
}
