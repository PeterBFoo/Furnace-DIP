package edu.poniperro.otherstuff;

import edu.poniperro.interfaces.Heater;

public class Jedi implements Heater {
    private boolean encendido = false;

    public Jedi(){}

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

    public void speak() {
        System.out.println("Do or do not, there is no try");
    }
}
