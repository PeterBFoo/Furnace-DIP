package edu.poniperro.hardware;

import edu.poniperro.external.RoomTemperature;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;

public class Regulator {

    public Regulator() {}

    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {
        int minutes = 10;
        System.out.println("Regulador activado durante " + minutes + " minutos.\n\n");

        while (minutes > 0) {
            minutes --;

            if (heater.isEncendido()) {
                temperature.ascends();
            }
            else {
                temperature.descends();
            }

            if (thermometer.getTemperature(temperature) < minTemp && !heater.isEncendido()) {
                heater.turnOn();
            }

            if (thermometer.getTemperature(temperature) > maxTemp && heater.isEncendido()) {
                heater.turnOff();
            }
            System.out.println("Tiempo restante -> " + minutes + "\n" +
                    "Temperatura actual -> " + thermometer.getTemperature(temperature) + "\n"
                    + "Heater -> " + heater.isEncendido() + "\n");
        }
    }

    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature, int minutes) {
        System.out.println("Regulador activado durante " + minutes + " minutos.\n\n");

        while (minutes > 0) {
            minutes --;

            if (heater.isEncendido()) {
                temperature.ascends();
            }
            else {
                temperature.descends();
            }

            if (thermometer.getTemperature(temperature) < minTemp && !heater.isEncendido()) {
                heater.turnOn();
            }

            if (thermometer.getTemperature(temperature) > maxTemp && heater.isEncendido()) {
                heater.turnOff();
            }
            System.out.println("Tiempo restante -> " + minutes + "\n" +
                    "Temperatura actual -> " + thermometer.getTemperature(temperature) + "\n"
                    + "Heater -> " + heater.isEncendido() + "\n");
        }
    }
}
