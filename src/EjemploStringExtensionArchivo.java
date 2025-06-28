public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.indexOf(".");

        //Variable archivo
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4)); //Muestra lo mismo que "archivo.substring(14)".
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1)); //Permite imprimir desde la posición indicada.

        //Variable archivo1
        String archivo1 = "alguna_imagen.js";

        System.out.println("archivo1.length() = " + archivo1.length());
        System.out.println("archivo1.substring(14) = " + archivo1.substring(14));
        System.out.println("archivo1.substring(archivo.length()-4) = " + archivo1.substring(archivo1.length()-4));
        System.out.println("archivo1.substring(i+1) = " + archivo1.substring(i+1));

        //Variable archivo2
        String archivo2 = "alguna.imagen.pdf";
        int x = archivo2.indexOf("."),
                y = archivo2.lastIndexOf(".");

        System.out.println("archivo2.substring(x+1) = " + archivo2.substring(x+1));
        System.out.println("archivo2 = " + archivo2.substring(y+1));
    }
}
