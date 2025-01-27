public class ConversionDeTipos {
    public static void main(String[] args) {
        //Conversión de String a otros típos de datos.
        /*String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true"; //TRUE, false, FALSE, 1, yes.
        boolean logicoBool = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBool = " + logicoBool);*/

        //Tipo de dato var
        var numeroStr = "50";
        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        var realStr = "98765.43e-3";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        var logicoStr = "true"; //TRUE, false, FALSE, 1, yes.
        var logicoBool = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBool = " + logicoBool);

        //Conversión de otros tipos de datos a String.
        int otroNumeroInt = 100;
        System.out.println("\notroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e-2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e-3f);
        System.out.println("otroRealStr = " + otroRealStr);

        //El casting sirve para convertir tipos de datos pequeños a lo de mayor capacidad.
        //byte -> short -> char -> int -> long -> float -> double
        int i = 10000;
        short s = (short) i; //Se usa (short) para forzar la conversión (casting) al tipo de dato deseado.
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
