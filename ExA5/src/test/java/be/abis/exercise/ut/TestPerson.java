package be.abis.exercise.ut;

import be.abis.exercise.model.Person;
import org.junit.Test;

import java.time.LocalDate;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestPerson {

    @Test
    public void personShouldBe42(){
        //arrange
        int expected = 42;
        Person p = new Person(1, "John","Doe", LocalDate.of(1978, 8, 10));
        //act
        // assert
        assertThat(p.calculateAge(), is (equalTo(expected)));

    }
}
