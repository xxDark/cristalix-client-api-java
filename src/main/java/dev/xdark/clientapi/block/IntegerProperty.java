package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import it.unimi.dsi.fastutil.ints.IntSet;

@SidedApi(Side.SERVER)
public interface IntegerProperty extends Property<Integer> {

    static IntegerProperty create(String name, IntSet set) {
        throw CompileStub.create();
    }

    static IntegerProperty create(String name, int from, int to) {
        throw CompileStub.create();
    }
}
