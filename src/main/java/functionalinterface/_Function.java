package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        //Function takes 1 argument and produces 1 result
        int res = incrementByOne(1);
        System.out.println(res);

        int res2 = incrementByOneFunction.apply(1);
        System.out.println(res2);

        int mult = incrementByOneFunction.andThen(multiplyBy10Function).apply(1);
        System.out.println(mult);

        //BiFunction takes 2 arguments and produces 1 result

        int res3 = incrementByOneAndMultiply(1, 5);
        System.out.println(res3);

        int res4 = incrementByOneAndMultiplyFunction.apply(1, 5);
        System.out.println(res4);

    }

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static int incrementByOne(int number){
        return ++number;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction = (number, numberToIncrementBy) -> (number + 1) * numberToIncrementBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

}
