

import org.junit.jupiter.*;
import org.assertj.core.api.Assertions;


//Testing SavingsBankAccount.cs

@Test
public testThatAmountisGreaterThanZero() {
    //Testing object from InterestCalculator constructor

    Assertions.assertThat(this.interestCalculator).isNotEqualTo(null);

    //Testing Account Number argument in GetBalance method
        int accountNumberLength = accountNumber;
        Assertions.assertThat(accountNumberLenght).isGreaterThan(10);
}