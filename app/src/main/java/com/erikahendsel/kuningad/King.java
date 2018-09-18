package com.erikahendsel.kuningad;

//Lihtne mudeli klass, kus saame oma andmed
public class King {

    private String name;
    private int from, to;
//Constructor
    public King(String name, int from, int to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }
//Getterid
    public String getName() {
        return name;
    }
    public int getFrom() {
        return from;
    }
    public int getTo() {
        return to;
    }
    //toString method that will return the value for each object in the ListView container
    public String toString() {
        return name;
    }
}
