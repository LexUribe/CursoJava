public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        System.out.println("################################## MÉTODOS PARA CONVERTIR UN STRING EN UN ARREGLO ##################################");
        System.out.println("\ntrabalenguas.length() = " + trabalenguas.length()); //En una cadena length() es un método en la variable de tipo String.
        System.out.println("\n$# MÉTODO TO CHAR ARRAY");
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //Método para escribir un dato de tipo String a un arreglo de caracteres. Es un valor de referencia que al imprimirlo muestra el identificador o hash del objeto.

        //Para mostrar los elementos del arreglo es necesario utilizar una iteración. Los ciclos a usar es un For o un While. En este caso se implementa la estructura For y así mostrar cada carácter del arreglo de tipo String.
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; //En un arreglo, length es un atributo en la variable de tipo char[].

        System.out.println("\n$# IMPRESIÓN DE LOS ELEMENTOS DEL ARREGLO CON EL CICLO FOR");
        System.out.println("- CON SALTO DE LINEA");
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.println("\tarreglo [" + i + "] = " + arreglo[i]);
        }

        System.out.println();
        System.out.println("- SIN SALTO DE LINEA");

        for (int i = 0; i < largo; i++) {
            System.out.print("\t" + arreglo[i]);
        }

        System.out.print("\n\t");

        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }

        System.out.println("\n\n$# MÉTODO SPLIT");
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a")); //El método split() convierte un arreglo de String según una expresión regular o un parámetro. Realiza un arreglo de tipo String tomando como referencia la letra "a" se´parando las palabras o letras y las convierte como elementos de un arreglo de tipo String.
        System.out.println("trabalenguas = " + trabalenguas);

        String[] arreglo1 = trabalenguas.split("a");
        int l = arreglo1.length;

        System.out.println("\n- Variable \"arreglo1 [j]\"");

        for (int j = 0; j < l; j++) {
            System.out.println("\tarreglo1 [" + j + "] = " + arreglo1[j]);
        }

        String archivo = "alguna.imagen.pdf"; //pdfXxX
        String[] archivoArreglo = archivo.split("\\."); //La notación "\\." o "[.]" es una expresión regular. El punto es una palabra clave o reservada de expresiones regulares por lo tánto no se debe usar sola, hay que escaparlo con "\\." o "[.]".
        l = archivoArreglo.length;

        System.out.println("\narchivo.split(\"\\\\.\") = " + archivo.split("\\."));
        System.out.println("archivo = " + archivo);

        System.out.println("\n- Variable \"archivoArreglo [j]\"");

        for (int j = 0; j < l; j++) {
            System.out.println("\tarchivoArreglo [" + j + "] = " + archivoArreglo[j]);
        }

        System.out.println("\narchivo.split(\".\") = " + archivo.split("."));
        System.out.println("archivo = " + archivo);

        System.out.println("\n- Variable \"archivoArr[i]\"");

        String[] archivoArr = archivo.split(".");
        l = archivoArr.length;
        System.out.println("l = " + l);
        for (int i = 0; i < l; i++) {
            System.out.println("\tarchivoArr [" + i + "] = " + archivoArr[i]);
        }

        System.out.println("\tComo el \".\" es expresión regular, no lo toma.");

        System.out.println("\narchivo.split(\"[.]\") = " + archivo.split("[.]")); //La notación "[.]" indica un carácter de forma literal o específica cuando son palabras clave y para definir un set, un conjunto o para agrupar varios caracteres.
        System.out.println("archivo = " + archivo);
        System.out.println("\n- Variable \"archivoArr1 [j]\"");

        String[] archivoArr1 =  archivo.split("[.]");
        l =archivoArr1.length;

        for (int j = 0; j < l; j++) {
            System.out.println("\tarchivoArr1["+ j + "] = " + archivoArr1[j]);
        }

        System.out.println("\n\n$# OBTENER LA EXTENSIÓN DE UN ARCHIVO");
        String extension = archivoArreglo[l-1]; //l = archivoArreglo.length;
        System.out.println("extension = " + extension);
    }
}
