package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println( isPhoneNumberValid("07000000000") );
        System.out.println( isPhoneNumberValid("050000000") );

        System.out.println( isPhoneNumberValidFunction.test( "07738400000" ) );

        System.out.println( isPhoneNumberValidFunction.and(containsNumber3).test( "07708400000" ) );

    }

    //FunctionalInterface Predicate
    static Predicate<String> isPhoneNumberValidFunction = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid( String phoneNumber ) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

}
