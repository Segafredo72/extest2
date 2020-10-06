package exercise.service;

import exercise.exception.SalaryTooLowException;
import exercise.model.Person;

public interface PaymentService {
    void paySalary(Person person) throws SalaryTooLowException;
}
