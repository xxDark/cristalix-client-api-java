package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface GuiChat extends GuiScreen {

    static GuiChat of() {
        throw CompileStub.create();
    }

    static GuiChat of(String defaultInputFieldText) {
        throw CompileStub.create();
    }
}
