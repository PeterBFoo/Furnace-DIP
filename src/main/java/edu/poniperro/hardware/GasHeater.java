package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;

public class GasHeater implements Heater {
    private boolean encendido = false;

    public GasHeater(){}

    @Override
    public void turnOn() {
        this.encendido = true;
    }

    @Override
    public void turnOff() {
        this.encendido = false;
    }

    @Override
    public boolean isEncendido() {
        return this.encendido;
    }
}
