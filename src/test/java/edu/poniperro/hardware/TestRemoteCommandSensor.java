package edu.poniperro.hardware;

import edu.poniperro.external.RoomTemperature;
import edu.poniperro.interfaces.Thermometer;
import org.junit.Assert;
import org.junit.Test;

public class TestRemoteCommandSensor {

    @Test
    public void testGetTemperature() {
        Thermometer thermometer = new RemoteCommandSensor();
        RoomTemperature temperature = new RoomTemperature(15);

        Assert.assertEquals(15, thermometer.getTemperature(temperature), 0);
    }
}
