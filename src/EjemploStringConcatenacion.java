public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        //Concatenación de objetos de la clase String.
        //Concatenación cadenas de texto.
        String curso = "Programación Java"; //Método estándar (Forma literal) abreviado por ser una clase muy usada.
        String profesor = "Bruce Dickinson";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        //Concatenación cadenas de texto y números enteros.
        int numeroA = 10;
        int numeroB = 50;
        System.out.println(detalle + numeroA + numeroB); //Si al principio se encuentra una cadena asume que se trata de una cadena en su totalidad. Las expresiones se evalúan de izquierda a derecha.
        System.out.println(detalle + (numeroA + numeroB)); //Los paréntesis "()" cambian la precedencia o el orden en que se ejecutan las operaciones.
        System.out.println(numeroA + numeroB + detalle);

        String detalle1 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle1 = " + detalle1);

        detalle1 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle1.1 = " + detalle1);
    }
}