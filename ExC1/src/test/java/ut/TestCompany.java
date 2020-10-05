package ut;

import exercise.model.Address;
import exercise.model.Company;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCompany {

    @Test
    public void taxForBelgianCompanyShouldBe51 (){
    //Arrange
        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
        Company c = new Company("ABIS",a);
    //Act
    //Assert
    assertThat(c.calculateTaxToPay(), is (equalTo(51.0)));
    }
}
