package edu.poniperro.main;

import edu.poniperro.otherstuff.Jedi;
import edu.poniperro.external.RoomTemperature;
import edu.poniperro.hardware.*;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;

public class App
{
    public static void main( String[] args )
    {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = new RoomTemperature(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}
