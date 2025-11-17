import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        /** Son operadores formados por tres partes o argumentos.
         * La primera evalúa una expresión booleana, si esta se cumple devuelve un valor y si no devuelve otro. Siempre del mismo tipo.
         * Estructura: "variable = condición ? si es verdadero: si es falso;"
          */

        // Ejemplo 1
        String variable = 7 == 5 ? "Si, es verdadero": "Si, es falso";
        System.out.println("variable = " + variable);

        //Ejemplo 2
        String estado = "";
        double promedio = 5.2;

        estado = promedio >= 5.49 ? "Aprovado" : "Reprovado";
        System.out.println("estado = " + estado);

        /*if (promedio >= 5.49) {
            estado = "Aprovado";
        } else {
            estado = "Reprovado";
        }*/

        // Ejemplo 3
        String est = "";
        double prom = 0.0,
                matematicas = 0.0,
                ciencias = 0.0,
                historia = 0.0;
        Scanner s= new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas ente 2.0 y 7.0: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias ente 2.0 y 7.0: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia ente 2.0 y 7.0: ");
        historia = s.nextDouble();

        prom = (matematicas + ciencias + historia) / 3;
        System.out.println("prom = " + prom);

        est = prom >= 5.49 ? "Aprovado" : "Reprovado";
        System.out.println("est = " + est);
    }
}
