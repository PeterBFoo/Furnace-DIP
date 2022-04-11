package edu.poniperro.hardware;

import edu.poniperro.external.RoomTemperature;
import edu.poniperro.interfaces.Thermometer;

public class RemoteCommandSensor implements Thermometer {
    private double temperature;

    public RemoteCommandSensor(){}

    @Override
    public double getTemperature(RoomTemperature temperature) {
        updateTemperature(temperature.getRoomTemperature());
        return this.temperature;
    }

    private void updateTemperature(double temperature) {
        this.temperature = temperature;
    }

}
