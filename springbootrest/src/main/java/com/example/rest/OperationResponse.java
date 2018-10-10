package com.example.rest;

public class OperationResponse {
    private boolean done;

    public OperationResponse() {
    }

    public OperationResponse(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
