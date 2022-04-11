package edu.poniperro.hardware;

import edu.poniperro.external.RoomTemperature;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;
import org.junit.Test;

public class TestRegulator {
    private final double minTemperature = 19;
    private final double maxTemperature = 24;


    @Test
    public void testRegulate() {
        Regulator regulator = new Regulator();

        Thermometer thermometer = new RemoteCommandSensor();
        Heater heater = new GasHeater();
        RoomTemperature roomTemperature = new RoomTemperature(15);

        regulator.regulate(thermometer, heater, minTemperature, maxTemperature, roomTemperature, 20);
        // If the actual temp is lower than the minTemp or higher than the maxTemp it's a failed test, even it cannot be tested
        // Otherwise, if the actual temp doesn't decrease or increase is a failed test too
    }
}
