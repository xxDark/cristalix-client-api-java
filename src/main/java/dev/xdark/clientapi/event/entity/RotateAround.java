package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.SERVER)
public interface RotateAround extends Cancellable {

    Entity getEntity();

    float getOldYaw();

    float getOldPitch();

    float getNewYaw();

    float getNewPitch();

    void setNewYaw(float yaw);

    void setNewPitch(float pitch);
}
