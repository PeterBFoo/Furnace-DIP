package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.otherstuff.Jedi;
import org.junit.Assert;
import org.junit.Test;

public class TestHeaters {

    @Test
    public void testTurnOn() {
        Heater encendedor = new GasHeater();

        encendedor.turnOn();
        Assert.assertTrue(encendedor.isEncendido());

        Jedi yoda = new Jedi();
        yoda.turnOn();
        Assert.assertTrue(encendedor.isEncendido());
    }

    @Test
    public void testTurnOff() {
        Heater encendedor = new GasHeater();

        encendedor.turnOff();
        Assert.assertFalse(encendedor.isEncendido());

        Jedi yoda = new Jedi();

        yoda.turnOff();
        Assert.assertFalse(encendedor.isEncendido());
    }
}
