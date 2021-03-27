package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.awt.image.BufferedImage;

@SidedApi(Side.BOTH)
public interface ScreenshotHelper {

    BufferedImage createScreenshot();

    BufferedImage createScreenshot(int width, int height);
}
