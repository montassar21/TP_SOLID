package com.directi.training.ocp.exerciseTry;

public abstract class Slot {


    public abstract int findFreeSlot();

    public abstract void markSlotBusy(int resourceId);
    
    public abstract void markSlotFree(int resourceId);
    
}
