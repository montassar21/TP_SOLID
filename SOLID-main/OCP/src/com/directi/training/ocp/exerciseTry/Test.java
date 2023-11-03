package com.directi.training.ocp.exerciseTry;

public class Test {
	public static void main(String[] args) {
		Slot slot=new SpaceSlot();
		allocate(slot);
	}
	
	public static int allocate(Slot slot)
    {
        int resourceId;
        resourceId=slot.findFreeSlot();
        slot.markSlotBusy(resourceId);
        
        return resourceId;
    }
}
