package com.dsh105.sparktrail.listeners;


public class InteractDetails {

    public InteractType interactType;
    public ModifyType modifyType;

    public InteractDetails(InteractType interactType, ModifyType modifyType) {
        this.interactType = interactType;
        this.modifyType = modifyType;
    }

    public enum InteractType {
        BLOCK, MOB;
    }

    public enum ModifyType {
        ADD, STOP, CLEAR, START;
    }
}