package ut;

import exercise.exception.PersonShouldBeAdultException;
import exercise.model.Person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPerson {

    private Person p;

    @BeforeEach
    public void setUp(){
        p = new Person(1, "John","Doe", LocalDate.of(1978, 8, 10));
    }

    @Test
    public void personShouldBe42() throws PersonShouldBeAdultException {
         // assert
        assertThat(p.calculateAge(), is (equalTo(42)));

    }

    @Test
    public void toStringSentenceStartsWithPerson(){
         // assert
        assertThat(p.toString(), startsWith("Person"));

    }

    @Test
    public void calculateAgeShouldThrowExceptionWhenPersonNotAdult() throws PersonShouldBeAdultException {
        Person p2 = new Person(2,"Jane","Smith",LocalDate.of(2007, 8, 10));
        Throwable exception = assertThrows(PersonShouldBeAdultException.class, () -> p2.calculateAge());
        assertEquals("person is not an adult",exception.getMessage());
    }
}
