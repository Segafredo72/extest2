package ut;

import exercise.exception.PersonShouldBeAdultException;
import exercise.model.Person;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class TestPerson {

    private Person p;

    @Before
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

    @Test(expected= PersonShouldBeAdultException.class)
    public void calculateAgeShouldThrowExceptionWhenPersonNotAdult() throws PersonShouldBeAdultException {
        Person p2 = new Person(2,"Jane","Smith",LocalDate.of(2007, 8, 10));
        p2.calculateAge();
    }
}
