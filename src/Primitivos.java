public class Primitivos {
    // TIPOS DE DATOS PRIMITIVOS
    public static void main(String[] args) {
        System.out.println("----------------------------- TIPOS DE DATOS PRIMITIVOS -----------------------------");
        System.out.println("\n## PRIMITIVOS NUMÉRICOS ##");

        //Números enteros
        byte numeroByte = 127;
        System.out.println("\n############# TIPO byte #############");
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde a " + Byte.BYTES + " Byte");
        System.out.println("Tipo byte corresponde a " + Byte.SIZE + " bits");
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE + " bits");
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE + " bits");

        short numeroShort = 32767;
        System.out.println("\n############# TIPO short #############");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde a " + Short.BYTES + " Bytes");
        System.out.println("Tipo short corresponde a " + Short.SIZE + " bits");
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("\n############# TIPO int #############");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde a " + Integer.BYTES + " Bytes");
        System.out.println("Tipo int corresponde a " + Integer.SIZE + " bits");
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("\n############# TIPO long #############");
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde a " + Long.BYTES + " Bytes");
        System.out.println("Tipo long corresponde a " + Long.SIZE + " bits");
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        //Números reales
        System.out.println("\n## PRIMITIVOS FLOAT ##");
        float realFloat = 2.12e3f; //Igual a 2120f en notación científica;
        System.out.println("\n############# TIPO float #############");
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde a " + Float.BYTES + " Bytes");
        System.out.println("Tipo float corresponde a " + Float.SIZE + " bits");
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("\n############# TIPO double #############");
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde a " + Double.BYTES + " Bytes");
        System.out.println("Tipo double corresponde a " + Double.SIZE + " bits");
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);

        /* "var" es un tipo de sato flexible puede tomar los valores
         de byte, short, int, long, float y double.*/
        var numeroByteVar = 127;
        var numeroShortVar = 32767;
        var numeroIntVar = 2147483647;
        var numeroLongVar = 9223372036854775807L;
        var numeroFloatVar = 2.147F;
        var numeroDoubleVar = 3.1476D;
        System.out.println("\n############# TIPO var #############");
        System.out.println("numeroByteVar = " + numeroByteVar);
        System.out.println("numeroShortVar = " + numeroShortVar);
        System.out.println("numeroIntVar = " + numeroIntVar);
        System.out.println("numeroLongVar = " + numeroLongVar + "L o l");
        System.out.println("numeroFloatVar = " + numeroFloatVar + "F o f");
        System.out.println("numeroDoubleVar = " + numeroDoubleVar + "D o d");

        System.out.println("\n## PRIMITIVOS CARACTERES ##");
        System.out.println("\n############# TIPO char #############");
        //Caracteres
        char caracter = '\u0040';//'@'; //Unicode que representa al @.
        char decimal = 64; //Decimal que representa al @.
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("¿decimal = caracter?, " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("\nsimbolo = " + simbolo);
        System.out.println("¿simbolo = caracter?, " + (simbolo == caracter));

        System.out.println("Tipo char corresponde a " + Character.BYTES + " Bytes");
        System.out.println("Tipo char corresponde a " + Character.SIZE + " bits");
        System.out.println("Valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un char" + Character.MIN_VALUE);

        System.out.println("\n############# TIPO var #############");
        var caracterVar = '\u0040'; //Unicode que representa al @.
        var decimalVar = 64; //Decimal que representa al @.

        //Caracteres especiales
        char espacio = '\u0020'; //Unicode que representa al espacio.
        char retroceso = '\b'; //Backspace espacio hacia atrás, sirve para borrar.
        char tabulador = '\t'; //Tabulador.
        char nuevaLinea = '\n'; //Salto de linea.
        char retornoCarro = '\r'; //Retorno de carro [System.getProperty("line.separator")] [System.lineSeparator()].
        System.out.println(tabulador + "caracterVar =" + espacio + nuevaLinea + caracterVar);
        System.out.println(tabulador + "decimalVar =" + retroceso + retornoCarro + System.lineSeparator() + decimalVar);
        System.out.println(tabulador + "¿\tdecimalVar = \ncaracterVar\t?, " + System.getProperty("line.separator") + (decimalVar == caracterVar));

        System.out.println("\n## PRIMITIVOS BOOLEAN ##");
        System.out.println("\n############# TIPO boolean #############");
        boolean datoLoico = Boolean.TRUE; //true;
        System.out.println("datoLoico = " + datoLoico);

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2f; //123.45
        System.out.println("f = " + f);
        datoLoico = d < f;
        System.out.println("datoLoico = " + datoLoico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}