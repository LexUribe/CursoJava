public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("--------------- OPERADORES LÓGICOS ---------------");
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        System.out.println("\nVariables" +  // Valor inicial de las variables a utilizar.
                "\n\ti = " + i +
                "\n\tj = " + j +
                "\n\tk = " + k +
                "\n\tl = " + l +
                "\n\tm = " + m);

        // Las condiciones siempre se evalúan de izquierda a derecha.
        // AND. Todas las condiciones tienen que ser "true" para que la expresión sea "true". Si hay una "false", toda la expresión es "false".
        System.out.println("\nAND");
        boolean b1 = i == j && k > l;
        System.out.println("- b1 = i == j && k > l => " + b1);

        boolean b2 = i <= j && k < l && m == false;
        System.out.println("- b2 = i <= j && k < l && m == false => " + b2);

        // OR. Con una condición que sea "true", la expresión es "true". Al menos una condición se tiene que cumplir.
        System.out.println("\nOR");
        boolean b3 = i <= j || k > l;
        System.out.println("- b3 = i <= j && k > l => " + b3);

        // AND Y OR.
        System.out.println("\nAND Y OR");
        boolean b4 = i == j && k > l || m == false;
        System.out.println("- b4 = i == j && k > l || m == false => " + b4);

        boolean b5 = i == j && (k > l || m == false);
        System.out.println("- b5 = i == j && (k > l || m == false) => " + b5);

        boolean b6 = (i == j && k > l) || m == false;
        System.out.println("- b6 = (i == j && k > l) || m == false => " + b6);

        /**
         * La precedencia en los operadores lógicos:
         *  - Siempre se evalúa de izquierda a derecha.
         *  - Siempre va a tener prioridad AND antes que OR.
         */
        System.out.println("\nPRECEDENCIA");
        boolean b7 = i <= j || k < l && m == true;
        System.out.println("- b7 = i <= j || k < l && m == true => " + b7);

        boolean b8 = i <= j || (k > l && m == true);
        System.out.println("- b8 = i <= j || (k > l && m == true) => " + b8);

        boolean b9 = (i <= j || k < l) && m == true;
        System.out.println("- b9 = (i <= j || k < l) && m == true => " + b9);

        boolean b10 = true || true && false;
        System.out.println("\n- b10 = true || true && false => " + b10);

        boolean b11 = true || (false && false);
        System.out.println("- b11 = true || (false && false) => " + b11);

        boolean b12 = (true || true) && false;
        System.out.println("- b12 = (true || true) && false => " + b12);

        boolean b13 = true || false && false || false;
        System.out.println("\n- b13 = true || false && false || false => " + b13);

        boolean b14 = ((true || false) && false) || false;
        System.out.println("- b14 = ((true || false) && false) || false => " + b14);
    }
}
