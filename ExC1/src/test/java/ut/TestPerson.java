package ut;


import exercise.exception.PersonShouldBeAdultException;
import exercise.model.Company;
import exercise.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class TestPerson {

    @Mock
    Company mockCompany;
    private Person p;

    @Before
    public void setUp(){
        p = new Person(1, "John","Doe", LocalDate.of(1978, 8, 10), 50000.0);
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
        Person p2 = new Person(2,"Jane","Smith",LocalDate.of(2007, 8, 10),40000.0);
        p2.calculateAge();
    }

    @Test
    public void calculateNetSalaryOfBelgianPersonUsingMockCompany(){
        //Arrange
        Person p2 = new Person(2,"Jane","Smith",LocalDate.of(2007, 8, 10), 50000.0, mockCompany);
        System.out.println(mockCompany);
        when(mockCompany.calculateTaxToPay()).thenReturn(51.0);

        //Assert
        assertThat(p2.calculateNetSalary(), is(equalTo(24500.0)));
        verify(mockCompany,times(1)).calculateTaxToPay();

    }
}
