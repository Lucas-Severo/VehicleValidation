package com.github.lucas_severo.vehicle.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ChassiValidatorTest {
    
    @Test
    public void shouldAssertTrueToValidChassis() {
        assertTrue(new ChassiValidator().validate("5FN-YF3H5-5EB026654"));
        assertTrue(new ChassiValidator().validate("1MEFM59S3YA622693"));
        assertTrue(new ChassiValidator().validate("2T1KU40E09C134221"));
        assertTrue(new ChassiValidator().validate("1GCEC19R0WR112404"));
        assertTrue(new ChassiValidator().validate("JM1BL1W74C1532800"));
        assertTrue(new ChassiValidator().validate("5TFPX4EN5DX017797"));
        assertTrue(new ChassiValidator().validate("5J6TF1H51AL015702"));
        assertTrue(new ChassiValidator().validate("1GBJK39DX6E165432"));
        assertTrue(new ChassiValidator().validate("JH4KA7532NC036794"));
        assertTrue(new ChassiValidator().validate("JH4DB7660SS001798"));
        assertTrue(new ChassiValidator().validate("WBSPM9C52BE202514"));
        assertTrue(new ChassiValidator().validate("JH4DA1850HS006058"));
        assertTrue(new ChassiValidator().validate("JH4CC2660PC002236"));
        assertTrue(new ChassiValidator().validate("JH4DB1550PS001359"));
    }
    
    @Test
    public void shoudAssertFalseToInvalidChassis() {
        assertFalse(new ChassiValidator().validate("5N1AN0NU1BC506916"));
        assertFalse(new ChassiValidator().validate("1GKEV16KXLF538649"));
        assertFalse(new ChassiValidator().validate("1JCCN18N2CT047552"));
        assertFalse(new ChassiValidator().validate("1FUJA6CV54DM34063"));
        assertFalse(new ChassiValidator().validate("1GTEC14W3YZ246726"));
        assertFalse(new ChassiValidator().validate("JH4KA4661JC005061"));
        assertFalse(new ChassiValidator().validate("JH4DA934XNS001774"));
        assertFalse(new ChassiValidator().validate("JH4DA3448HS012198"));
        assertFalse(new ChassiValidator().validate("ZAMBC38A050014565"));
        assertFalse(new ChassiValidator().validate("WD5WD641425381291"));
        assertFalse(new ChassiValidator().validate("JH4DB1659NS000627"));
        assertFalse(new ChassiValidator().validate("4JGBF71E28A429191"));
    }
}
