package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;

@SidedApi(Side.SERVER)
public abstract class AbstractButtonAdapter implements ButtonAdapter {

    @Override
    public int getHoverState(boolean state) {
        return STANDARD.getHoverState(state);
    }

    @Override
    public void drawButton(Minecraft mc, int x, int y, float tickLength) {
        STANDARD.drawButton(mc, x, y, tickLength);
    }

    @Override
    public void mouseDragged(Minecraft mc, int x, int y) {
        STANDARD.mouseDragged(mc, x, y);
    }

    @Override
    public void mouseReleased(int x, int y) {
        STANDARD.mouseReleased(x, y);
    }

    @Override
    public boolean mousePressed(Minecraft mc, int x, int y) {
        return STANDARD.mousePressed(mc, x, y);
    }

    @Override
    public void drawButtonForegroundLayer(int mouseX, int mouseY) {
        STANDARD.drawButtonForegroundLayer(mouseX, mouseY);
    }
}
