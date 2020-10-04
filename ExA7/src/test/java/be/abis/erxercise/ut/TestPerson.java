import be.abis.exercise.model.Person;
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
    public void personShouldBe42(){
        //arrange
        //act
        // assert
        assertThat(p.calculateAge(), is (equalTo(42)));

    }

    @Test
    public void toStringSentenceStartsWithPerson(){
        //arrange
        //act
        // assert
        assertThat(p.toString(), startsWith("Person"));

    }
}
