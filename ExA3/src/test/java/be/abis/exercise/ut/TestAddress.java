package be.abis.exercise.ut;

import be.abis.exercise.model.Address;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

public class TestAddress {

    @Test
    public void belgianZipCodeShouldBeNumeric(){

        //Aarange
        Address a = new Address("Diestesteenweg","32 bus 4B","3000","Leuven","Belgie","BE");
        //Act
        boolean b = a.checkBelgianZipCode();
        //Assess
        assertTrue(b);
    }
}
