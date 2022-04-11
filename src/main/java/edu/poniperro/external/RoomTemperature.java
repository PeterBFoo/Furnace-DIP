package edu.poniperro.external;

public class RoomTemperature {
    private double roomTemperature;

    public RoomTemperature(double roomTemperature) {
        this.roomTemperature = roomTemperature;
    }

    public double getRoomTemperature() {
        return this.roomTemperature;
    }

    private void setRoomTemperature(double temperature) {
        this.roomTemperature = temperature;
    }

    public void descends() {
        RoomTemperature temperature = new RoomTemperature(this.roomTemperature - 0.5);
        setRoomTemperature(temperature.getRoomTemperature());
    }

    public void ascends() {
        RoomTemperature temperature = new RoomTemperature(this.roomTemperature + 1);
        setRoomTemperature(temperature.getRoomTemperature());
    }
}
