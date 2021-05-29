package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class MainCombinatorPattern {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Jorge",
                "0573168271997",
                "jorgecorreo.com",
                LocalDate.of(1982, 04, 23)
        );

        //System.out.println( new CustomerValidationService().isValid( customer ) );

        //Now lets use de combinator pattern for validating the customer
        ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isAdult()).apply(customer);

        System.out.println(result);

        if ( result != ValidationResult.SUCCESS ) {
            throw new IllegalStateException(result.name());
        }

    }

}
