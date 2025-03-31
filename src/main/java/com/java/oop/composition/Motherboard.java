package com.java.oop.composition;

public class Motherboard {
    private String boardId;
    private String processor;
    private int ramCapacity;

    //SETTERS AND GETTERS
    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getBoardId() {
        return this.boardId;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return this.processor;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getRamCapacity() {
        return this.ramCapacity;
    }

    @Override
    public String toString() {
        return "["+this.boardId+" : "+this.ramCapacity+" : "+this.processor+"]";
    }
}
