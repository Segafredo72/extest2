package exercise.service;

import exercise.exception.SalaryTooLowException;
import exercise.model.Person;

public class AbisPaymentService implements PaymentService {
    public void paySalary(Person person) throws SalaryTooLowException {
        double salary = person.calculateNetSalary();
        System.out.println("Paying " + salary + " euros to " + person.getFirstName());
    }
}

