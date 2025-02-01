public class EjemploString {
    public static void main(String[] args) {
        //Objeto String en la literal vs operador.
        String curso = "Programación Java."; //Método estándar (Forma literal) abreviado por ser una clase muy usada.
        String curso1 = new String("Programación Java."); //Método tradicional con el constructor.
        String curso2 = "programación java.";

        System.out.println("curso = " + curso);
        System.out.println("curso1 = " + curso1);
        System.out.println("curso2 = " + curso2);

        boolean esIgual = curso == curso1; //Comparación por referencia con el "==".
        System.out.println("\n\"curso == curso1\" = " + esIgual);

        esIgual = curso.equals(curso1); //Comparación por valor con el método "equals()" de la clase String.
        System.out.println("\"curso.equals(curso1)\" = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); //Hace la comparación ignorando las mayúsculas.
        System.out.println("\"curso.equalsIgnoreCase(curso2)\" = " + esIgual);

        String curso3 = "Programación Java."; //Java optimiza la memoria detectando que los objetos iguales "curso == curso3".
        System.out.println("\ncurso3 = " + curso3);
        esIgual = curso == curso3;
        System.out.println("\"curso == curso3\" = " + esIgual);
    }
}