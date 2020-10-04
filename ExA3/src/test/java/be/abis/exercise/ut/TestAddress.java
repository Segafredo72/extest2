package be.abis.exercise.ut;

import be.abis.exercise.model.Address;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

public class TestAddress {

    @Test
    public void belgianZipCodeShouldBeNumeric(){
        fail();
        //Aarange
        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgie","BE");
        //Act
        int zipCode = Integer.parseInt(a.getZipCode());
        //Assess
        assertEquals(Integer.parseInt(a.getZipCode()),zipCode);
    }
}
