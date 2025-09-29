public class OperadoresRelacionales {
    public static void main(String[] args) {
        System.out.println("--------------- OPERADORES RELACIONALES ---------------");
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
        //System.out.println("\ti = " + i);
        //System.out.println("\tj = " + j);
        //System.out.println("\tk = " + k);
        //System.out.println("\tl = " + l);
        //System.out.println("\tm = " + m);
        
        // Igualdad: Este tipo de relación se utiliza típicamente en primitivos o literales únicamente.
        System.out.println("\nIGUALDAD");
        boolean b1 = i == j;
        System.out.println("b1 = i == j => " + b1);

        // Negación: Sirve para invertir el valor de verdad.
        System.out.println("\nNEGACIÓN");
        boolean b2 = !b1; // ! negación o la contraparte.
        System.out.println("b2 = !b1 => " + b2);

        // Distinto: Se utiliza este tipo de relación típicamente con primitivos y booleanos.
        System.out.println("\nDISTINTO");

        System.out.println("- NUMÉRICO");
        boolean b3 = i != j;
        System.out.println("\tb3 = i != j => " + b3);

        System.out.println("- BOOLEANO");
        boolean b4 = m == true;
        System.out.println("\tb4 = m == true => " + b4);
        boolean b5 = m != true;
        System.out.println("\tb5 = m != true => " + b5);

        // Mayor que.
        System.out.println("\nMAYOR QUE");
        boolean b6 = i > j;
        System.out.println("b6 = i > j => " + b6);

        // Menor que.
        System.out.println("\nMENOR QUE");
        boolean b7 = i < j;
        System.out.println("b7 = i < j => " + b7);

        // Mayor o igual.
        System.out.println("\nMAYOR O IGUAL");
        boolean b8 = l >= k;
        System.out.println("b8 = l >= k => " + b8);

        // Menor o igual.
        System.out.println("\nMENOR O IGUAL");
        boolean b9 = l <= k;
        System.out.println("b9 = l <= k => " + b9);
    }
}
