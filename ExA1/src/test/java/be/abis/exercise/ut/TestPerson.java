package be.abis.exercise.ut;

import be.abis.exercise.model.Person;
import org.junit.Test;

import java.time.LocalDate;

import static junit.framework.TestCase.assertEquals;

public class TestPerson {

    @Test
    public void personShouldBe42(){
        //arrange
        int expected = 42;
        Person p = new Person(1, "John","Doe", LocalDate.of(1978, 8, 10));
        //act
        int age = p.calculateAge()+1;
        // assert
        assertEquals(expected, age);

    }
}
