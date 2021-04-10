package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface GuiSleepMP extends GuiChat {

    static GuiSleepMP of() {
        throw CompileStub.create();
    }
}
