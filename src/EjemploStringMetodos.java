public class EjemploStringMetodos {
    public static void main(String[] args) {
        // Métodos de la clase String.
        System.out.println("::::::::::::::::::::::::::::::::: MÉTODOS DEL OBJETO STRING :::::::::::::::::::::::::::::::::\n");
        String nombre = "Steve";
        System.out.println("#$ MÉTODO LENGTH");
        System.out.println("nombre.length() = " + nombre.length()); // Método para saber el tamaño de un arreglo.

        System.out.println("\n#$ MÉTODO TO UPPER CASE");
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // Método para convertir a mayúsculas.

        System.out.println("\n#$ MÉTODO TO LOWER CASE");
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // Método para convertir a minúscula,

        System.out.println("\n#$ MÉTODO EQUALS");
        System.out.println("nombre.equals(\"Steve\") = " + nombre.equals("Steve")); // Método para comparar a nivel de valor no de instancia.
        System.out.println("nombre.equals(\"steve\") = " + nombre.equals("steve"));

        System.out.println("\n#$ MÉTODO EQUALS IGNORE CASE");
        System.out.println("nombre.equalsIgnoreCase(\"steve\") = " + nombre.equalsIgnoreCase("steve")); // Método para comparar, ignorando mayúsculas y minúsculas.

        System.out.println("\n#$ MÉTODO COPARE TO");
        System.out.println("nombre.compareTo(\"Steve\") = " + nombre.compareTo("Steve")); // Método para hacer una comparación a nivel de orden alfabético, orden lexicográfico. Asigna un ordenamiento de acuerdo a la tabla unicode.
        System.out.println("nombre.compareTo(\"Alejo\") = " + nombre.compareTo("Alejo"));
        System.out.println("nombre.compareTo(\"Steven\") = " + nombre.compareTo("Steven"));

        System.out.println("\n#$ MÉTODO CHAR AT");
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // Método que toma el carácter definido en la posición del arreglo dado.
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("\n#$ MÉTODO SUBSTRING");
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // Método para obtener una parte o un fragmento del String.
        System.out.println("nombre.substring(0, 2) = " + nombre.substring(0, 2));
        System.out.println("nombre.substring(2, 3) = " + nombre.substring(2, 4));
        System.out.println("nombre.substring(4, 5) = " + nombre.substring(4, 5));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(nombre.length() -1) = " + nombre.substring(nombre.length() -1));
        System.out.println("nombre.substring(nombre.length() -2) = " + nombre.substring(nombre.length() -2));

        System.out.println("\n#$ MÉTODO REPLACE");
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", ".")); //Método que cambia o reemplaza algún carácter por otro.
        System.out.println("trabalenguas = " + trabalenguas);

        //BUSQUEDA EN UN STRING
        System.out.println("\n#$ MÉTODO INDEX OF Y LAST INDEX OF");
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //Método que permite saber si se encuentra algún carácter dentro del String, retorna el índice de la primera incidencia.
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //Método que permite saber la última incidencia.
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); //Cuando no encuentra el carácter muestra -1.
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));

        System.out.println("\n#$ MÉTODO CONTAINS");
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); //Método que permite saber si se encuentra algún carácter dentro del String, retorna true o false.
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));

        System.out.println("\n#$ MÉTODO STARTS WITH");
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); //Método que permite saber si un String comienza con, retorna true o false.
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));

        System.out.println("\n#$ MÉTODO ENDS WITH");
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); //Método que permite saber si un String termina con, retorna true o false.
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas"));
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalenguas.endsWith("traba"));

        System.out.println("\n#$ MÉTODO TRIM");
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim()); //Método que quita los espacios en blanco a ambos lados.
    }
}
