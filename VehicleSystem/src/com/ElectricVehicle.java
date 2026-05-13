package com;

public class ElectricVehicle extends Vehicle {
    private final static long serialVersionUID = 1L;

    int battery;
    int chargingTime;

    ElectricVehicle(int vno, String make, int battery, int chargingTime) {
        super(vno,make);
        this.battery = battery;
        this.chargingTime = chargingTime;
    }

    @Override
    public void showSpecs(){
        super.showSpecs();
        System.out.println("Status : Electric | Battery : " + battery);
        System.out.println("Whisper : The Driver you have " + battery*5 + " miles left");
    }

}
