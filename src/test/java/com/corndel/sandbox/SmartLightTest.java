package com.corndel.sandbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartLightTest {

    @Test
    public void testSmartLightShouldBeOffByDefault() {
        SmartLight device = new SmartLight();
        assertFalse(device.isOn());
    }

}