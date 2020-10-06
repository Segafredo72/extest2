package ut;

import exercise.exception.SalaryTooLowException;
import exercise.model.Person;
import exercise.service.AbisPaymentService;
import exercise.service.PaymentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)

public class TestPaymentService {

    PaymentService ps ;

@Mock Person mockPerson;

    @Before
    public void setUp(){
        ps = new AbisPaymentService();
    }
    @Test(expected= SalaryTooLowException.class)
    public void lowNetSalaryShouldThrowException() throws SalaryTooLowException {
        //Arrange
      //Act
        when(mockPerson.calculateNetSalary()).thenThrow(SalaryTooLowException.class);
        //Assert
        ps.paySalary(mockPerson);
        verify(mockPerson,times(1)).calculateNetSalary();
    }
}
