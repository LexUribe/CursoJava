import java.util.Scanner;

public class ProgramaManejoDeNombresT3 {
    public static void main(String[] args) {
        /*
         * Tarea 3: Programa manejo de nombres. SECCIÓN 3: TIPO STRING: CADENAS.
         *
         * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
         *
         *  - Se requiere desarrollar un programa que reciba los nombres de 3 integrantes
         *    de tu familia o amigos como argumentos de línea de comandos.
         *
         *  - Se pide por cada nombre de la persona una nueva variable del tipo String al
         *    tomar el segundo carácter pero convertido en mayúscula y se le concatena un
         *    punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe
         *    quedar como N.es
         *
         *  - Debe imprimir como resultado los tres nuevos nombres separado con guion
         *    bajo (como una única variable).
         *
         * Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
         * N.es_A.ia_E.pe
         */

        // - Reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------ MANEJO DE NOMBRES ------------------------------------");
        System.out.println("Ingrese el nombre de un familiar o amigo: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese otro nombre de un familiar o amigo: ");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese otro nombre de un familiar o amigo: ");
        String nombre2 = sc.nextLine();

        // - Por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido
        //   en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
        String concat = nombre.toUpperCase().charAt(1) + "." + nombre.substring(nombre.length()-2);
        String concat1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        String concat2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);

        /* Segunda opción.
         * String concat = nombre.toUpperCase().substring(1,2) + "." + nombre.substring(nombre.length()-2);
         * String concat1 = nombre1.toUpperCase().substring(1,2) + "." + nombre1.substring(nombre1.length()-2);
         * String concat2 = nombre2.toUpperCase().substring(1,2) + "." + nombre2.substring(nombre2.length()-2);
         */

        // - Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
        String resutado = "\n" + concat + "_" + concat1 + "_"  + concat2;
        System.out.println(resutado);
    }
}
