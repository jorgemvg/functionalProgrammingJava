package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Suplier {

    //Supplier<T>, representa algo que suministra, provee, proporciona resultados.
    //it returns any kind of value that you want

    public static void main(String[] args) {
        System.out.println( getDBConnectionUrl.get() );

        System.out.println();

        System.out.println( getDBConnectionUrlList.get() );

    }

   /* static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/user";
    }*/

    static Supplier<String> getDBConnectionUrl = () -> "jdbc://localhost:5432/user";

    static Supplier<List<String>> getDBConnectionUrlList =
            () -> List.of("jdbc://localhost:5432/user", "jdbc://localhost:5432/game");

}