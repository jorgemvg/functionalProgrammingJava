package optionals;

import java.util.Optional;

public class MainOptionals {

    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable(null);
        System.out.println("Probando con valor: " + (hello.isPresent() ? hello.get() : "valor is not present"));
        System.out.println( "IsEmpty: " + hello.isEmpty() );
        System.out.println( "IsPresent: " + hello.isPresent() );
        System.out.println( "Sino: " + hello.orElse( "Otro String" ) );

        String orElse = hello
                .map(String::toUpperCase)
                .orElseGet( () -> {
                    //extra computation to retrieve the value
                    return "Esto se retorna si el valor es null";
                });
        System.out.println(orElse);

        System.out.println("*****************+");

        //if the value is not null return the value, if not returns "default value"
        Object value = Optional.ofNullable("Valor").orElseGet(() -> "default value" );
        System.out.println( value );

        //if the email is present it'll send the email. If not does nothing
        Optional.ofNullable("correo@correo.com").ifPresent(email -> System.out.println("Sending email to " + email));

        //
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("cannot send the email"));

    }

}