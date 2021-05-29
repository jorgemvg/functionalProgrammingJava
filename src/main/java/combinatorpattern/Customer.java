package combinatorpattern;

import java.time.LocalDate;

public class Customer {

    private final String name;
    private final String phoneNumber;
    private final String email;
    private final LocalDate dateOfBirth;


    public Customer(String name, String phoneNumber, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
