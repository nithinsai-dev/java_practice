package com;

import java.io.*;

public class Vehicle implements Serializable {
    private final static long serialVersionUID = 1L;

    int vno;
    String make;

    Vehicle(int vno,String make){
        this.vno = vno;
        this.make = make;
    }

    public void showSpecs(){
        System.out.println("Vehicle No : " + this.vno);
        System.out.println("Make : "+ this.make);
    }
}
