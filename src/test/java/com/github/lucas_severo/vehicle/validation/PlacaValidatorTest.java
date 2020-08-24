package com.github.lucas_severo.vehicle.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PlacaValidatorTest {

    @Test
    public void shouldAssertTrueToValidPlacas() {
        assertTrue(new PlacaValidator().validate("LMA-9744"));
        assertTrue(new PlacaValidator().validate("JTE-3780"));
        assertTrue(new PlacaValidator().validate("HZN7948"));
        assertTrue(new PlacaValidator().validate("EMG-5950"));
        assertTrue(new PlacaValidator().validate("EYG-5814"));
        assertTrue(new PlacaValidator().validate("DXV-0151"));
        assertTrue(new PlacaValidator().validate("RPW-3396"));
        assertTrue(new PlacaValidator().validate("RFG-3990"));
        assertTrue(new PlacaValidator().validate("HIG-2246"));
        assertTrue(new PlacaValidator().validate("RXH-1167"));
        assertTrue(new PlacaValidator().validate("RST-1939"));
        assertTrue(new PlacaValidator().validate("nxw-9697"));
        assertTrue(new PlacaValidator().validate("LYT-5109"));
        assertTrue(new PlacaValidator().validate("hre8311"));
        assertTrue(new PlacaValidator().validate("ODR-7943"));
    }
    
    @Test
    public void shoudAssertFalseToInvalidPlacas() {
        assertFalse(new PlacaValidator().validate("PN2-7634"));
        assertFalse(new PlacaValidator().validate("BPM-A090"));
        assertFalse(new PlacaValidator().validate("ENB31093"));
        assertFalse(new PlacaValidator().validate("ans2-1676"));
        assertFalse(new PlacaValidator().validate("FAG-44965"));
        assertFalse(new PlacaValidator().validate("HPAr8661"));
        assertFalse(new PlacaValidator().validate("MKS-9E24"));
        assertFalse(new PlacaValidator().validate("IK1-3857"));
        assertFalse(new PlacaValidator().validate("QD3007E"));
        assertFalse(new PlacaValidator().validate("MAK-963S"));
        assertFalse(new PlacaValidator().validate("EOV-BB46"));
    }
}