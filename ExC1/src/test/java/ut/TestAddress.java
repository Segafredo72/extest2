package ut;

import exercise.model.Address;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static junit.framework.TestCase.assertTrue;

public class TestAddress {

    @Test
    public void belgianZipCodeShouldBeNumeric(){

        //Aarange
        Address a = new Address("Diestesteenweg","32 bus 4B","3000","Leuven","Belgie","BE");
        //Act
        boolean b = a.checkBelgianZipCode();
        //Assert
        assertTrue(b);
    }

    @Ignore
    @Test
    public void noIdeaWhatYouGonnaTest(){

    }
}
