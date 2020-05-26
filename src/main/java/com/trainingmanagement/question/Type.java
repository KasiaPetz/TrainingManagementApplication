package com.trainingmanagement.question;

public enum Type {

    TEXT(0),
    TYPE_5(5);

    private int scale;

    Type(int scale) {
        this.scale = scale;
    }

    public int getScale() {
        return scale;
    }

}
