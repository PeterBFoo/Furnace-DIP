package edu.poniperro.external;

import org.junit.Assert;
import org.junit.Test;

public class TestRoomTemperature {

    @Test
    public void testConstructor() {
        RoomTemperature temperature = new RoomTemperature(17);
        Assert.assertNotNull(temperature);
    }

    @Test
    public void testDescend() {
        RoomTemperature temperature = new RoomTemperature(15);

        temperature.descends();
        Assert.assertEquals(14.5, temperature.getRoomTemperature(),0);
    }

    @Test
    public void testAscends() {
        RoomTemperature temperature = new RoomTemperature(19);

        temperature.ascends();
        Assert.assertEquals(20, temperature.getRoomTemperature(), 0);
    }
}
