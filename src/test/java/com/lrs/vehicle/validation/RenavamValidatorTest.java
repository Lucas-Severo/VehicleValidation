package com.lrs.vehicle.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author lucas
 */
@RunWith(MockitoJUnitRunner.class)
public class RenavamValidatorTest {
    
    @Test
    public void shouldAssertTrueToValidRenavams() {
        assertTrue(new RenavamValidator().validate("52844824529"));
        assertTrue(new RenavamValidator().validate("52724698208"));
        assertTrue(new RenavamValidator().validate("63130680271"));
        assertTrue(new RenavamValidator().validate("92535227312"));
        assertTrue(new RenavamValidator().validate("59497608405"));
        assertTrue(new RenavamValidator().validate("49937110607"));
        assertTrue(new RenavamValidator().validate("66746783577"));
        assertTrue(new RenavamValidator().validate("19213665779"));
        assertTrue(new RenavamValidator().validate("28284644994"));
        assertTrue(new RenavamValidator().validate("37170799947"));
        assertTrue(new RenavamValidator().validate("33090911918"));
        assertTrue(new RenavamValidator().validate("77560559419"));
        assertTrue(new RenavamValidator().validate("26125939560"));
        assertTrue(new RenavamValidator().validate("46738720842"));
    }
    
    @Test
    public void shoudAssertFalseToInvalidRenavams() {
        assertFalse(new RenavamValidator().validate("12345678910"));
        assertFalse(new RenavamValidator().validate("46338720842"));
        assertFalse(new RenavamValidator().validate("77460359419"));
        assertFalse(new RenavamValidator().validate("33190911918"));
        assertFalse(new RenavamValidator().validate("9876"));
    }
}
