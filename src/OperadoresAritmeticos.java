import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("--------------- Operadores Aritméticos ---------------");
        int i = 5,
                j = 4,
                suma = i + j;
        System.out.println("Variables");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("\nSUMA");
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j); // De izquierda a derecha inicia con el tipo de dato String haciendo que el símbolo "+" se use para concatenar, no realiza operaciones aritmeticas. Esto de debe a los tipos de datos y las operaciones que podemos realizar con ellos.
        System.out.println(i + j + " i + j ="); // En este caso inicia con dos enteros, entonces procede a hacer la operación aritmetica correspondiente y el resto lo concatena, ya que es de tipo String.
        System.out.println("(i + j) = " + (i + j)); // Con los paréntesis se cambia la prioridad o la precedencia. En este caso realiza la operación aritmetica primero por estar en el paréntesis.

        int resta = i - j;
        System.out.println("\nRESTA");
        System.out.println("resta = " + resta); // El símbolo "-" no es un operador propio de la clase String. No aplica, no existe el operador.
        System.out.println("(i - j) = " + (i - j));

        int multiplicacion = i * j;
        System.out.println("\nMULTIPLICACIÓN");
        System.out.println("multiplicacion = " + multiplicacion);

        System.out.println("\nDIVISIÓN");
        int division = i / j; //Este tipo de dato realiza una división entera. Sin parte decimal, el resultado lo aproxima al valor entero.
        System.out.println("- DIVISIÓN ENTERA");
        System.out.println("\tdivision = " + division);

        float division1 = i / j; // Sin convertir las variables "i" y "j" a float. El resultado sigue siendo el mismo, aunque representado de otra manera.
        System.out.println("\n- DIVISIÓN FLOTANTE CON VARIABLES ENTERAS");
        System.out.println("\tdivision1 = " + division1);

        float division2 = (float) i / j; // Se hace un cast al tipo de dato "float o double" para obtener las cifras decimales. También se puede escribir "float division2 = (float) i / (float) j;"
        System.out.println("\n- DIVISIÓN FLOTANTE CON CASTING EN VARIABLES ENTERAS");
        System.out.println("\tdivision2 = " + division2);

        int modulo = i % j; // Conocido como módulo o resto, se utiliza el símbolo "%".
        System.out.println("\nMODULO O RESTO");
        System.out.println("modulo = " + modulo);

        modulo = 8 % 5;
        System.out.println("modulo = " + modulo);

        System.out.println("\n- EJEMPLO USO RESTO O MODULO");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número")); // Se utiliza el comando "JOptionPane.showInputDialog("Ingresa un número")" para utilizar una ventana emergente y se usa "Integer.parseInt()" para convertir a entero el resultado de la ventana de diálogo.
        if (numero % 2 == 0) {
            System.out.println("\tNúmero par: " + numero);
        }else {
            System.out.println("\tNúmero impar: " + numero);
        }
    }
}
