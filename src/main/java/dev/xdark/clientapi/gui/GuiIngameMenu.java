package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface GuiIngameMenu extends GuiScreen {

    static GuiIngameMenu of() {
        throw CompileStub.create();
    }
}
