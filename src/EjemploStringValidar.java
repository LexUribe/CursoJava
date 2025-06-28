public class EjemploStringValidar {
    public static void main(String[] args) {
        // Distintas maneras de validar un String.
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
        if (esNulo == false) { // Ayuda a ocultar la excepción. Ejecuta sin problema.
            System.out.println(curso.toUpperCase()); // No ejecuta, porque "curso" es nulo. Solo se ejecuta cuando String tiene una instancia.
        }

        if (curso == null) { // También se puede escribir "if (esNulo)".
            curso = "Programación Java"; // " ";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("\nesVacio = " + esVacio);
        if (!esVacio) { // También se puede escribir "if (esVacio == false)" o "if (!(curso.length() == 0))" o "if (curso.length() > 0)".
            System.out.println(curso.toUpperCase()); // No ejecuta, porque "curso" es nulo. Solo se ejecuta cuando String tiene una instancia.
            System.out.println("Bienvenido al curso ".concat(curso)); // No ejecuta, porque "curso" es nulo. Solo se ejecuta cuando String tiene una instancia.
        }

        boolean esVacio2 = curso.isEmpty();

        System.out.println("\nesVacio2 = " + esVacio2);
        if (!esVacio2) { // También se puede escribir "if (curso.isEmpty() == false)".
            System.out.println(curso.toUpperCase()); // No ejecuta, porque "curso" es nulo. Solo se ejecuta cuando String tiene una instancia.
            System.out.println(curso.concat(" desde cero!")); // No ejecuta, porque "curso" es nulo. Solo se ejecuta cuando String tiene una instancia.
            System.out.println("Bienvenido al curso " + curso); // Ejecuta sin problema.
        }

        boolean esBlanco = curso.isBlank(); // Es la manera más estricta y más segura de validar. Este método solo está disponible desde el JDK 11 en adelante.

        System.out.println("\nesBlanco = " + esBlanco);
        if (esBlanco == false) {
            System.out.println(curso.toLowerCase());
        }
    }
}
