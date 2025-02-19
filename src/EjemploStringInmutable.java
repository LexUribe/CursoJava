public class EjemploStringInmutable {
    public static void main(String[] args) {
        //Inmutabilidad de los objetos String.
        String curso = "Programación Java"; //Método estándar (Forma literal) abreviado por ser una clase muy usada.
        String profesor = "Steve Harris";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado1 = curso.transform(c -> {
            return c + " con " + profesor;
        }); //Usando el método "transform()" se puede transformar, convertir o concatenar de un modo más funcional, utilizando expresiones lambda o función de flecha.
        System.out.println("curso = " + curso);
        System.out.println("resultado1 = " + resultado1);

        String resultado2 = resultado.replace("a", "A"); //La función "replace()" sirve para remplazar caracteres en una cadena.
        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
    }
}