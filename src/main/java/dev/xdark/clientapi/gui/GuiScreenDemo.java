package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface GuiScreenDemo extends GuiScreen {

    static GuiScreenDemo of() {
        throw CompileStub.create();
    }
}
