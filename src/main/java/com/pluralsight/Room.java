package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public String getRoomDetails() {
        return price + "|" + dirty;
    }

    public void checkIn() {
        if (isAvailable()){
            occupied = true;
            dirty = true;
        }
    }
    public void checkOut() {
        occupied = false;

    }
    public void cleanRoom() {
        if (!occupied) {
            dirty = false;
        }
    }

    @Override
    public String toString() {
        return numberOfBeds + "|" + price + "|" + occupied + "|" + dirty;
                /*"Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", occupied=" + occupied +
                ", dirty=" + dirty +
                '}';*/
    }
}

