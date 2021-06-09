package com.example.demo.model;

public class Calculator {
    private String catagotyID;
    private int duration;

    public Calculator() {
    }

    public Calculator(String catagotyID, int duration) {
        this.catagotyID = catagotyID;
        this.duration = duration;
    }

    public String getCatagotyID() {
        return catagotyID;
    }

    public void setCatagotyID(String catagotyID) {
        this.catagotyID = catagotyID;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
