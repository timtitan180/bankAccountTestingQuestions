
import org.junit.jupiter.api.*;
import org.assertj.core.api;


//Testing InterestCalculator.cs

@Test
public testThatAmountisGreaterThanZero() {
        InterestCalculator interestCalculatorObj = new InterestCalculator();
        interestCalculator.CalculateInterest(1000);
        Assertions.assertThat(interestCalculator.CalculateInterest(1000)).isGreaterThan(0);

        }