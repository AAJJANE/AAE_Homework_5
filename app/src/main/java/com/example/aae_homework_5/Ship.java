package com.example.aae_homework_5;

public class Ship {
    private String name;
    private String shipDescription;
    private int shipResource;

    public Ship (String name, String shipDescription, int shipResource) {
        this.name = name;
        this.shipDescription= shipDescription;
        this.shipResource = shipResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipDescription() {
        return shipDescription;
    }

    public void setShipDescription(String shipDescription) {
        this.shipDescription = shipDescription;
    }

    public int getShipResource() {
        return shipResource;
    }

    public void setShipResource(int shipResource) {
        this.shipResource = shipResource;
    }
}
