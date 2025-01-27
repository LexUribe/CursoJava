import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        //Interacción con el usuario.
        System.out.println("----------------------------- INTERACTUANDO CON EL USUARIO -----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngresa un número: ");
        //String numeroStr = sc.nextLine();
        int numeroDec = 0;
        try {
            numeroDec = sc.nextInt(); //Integer.parseInt(numeroStr); //Se convierte a entero (int), ya que es un String.
        } catch (Exception e) { //Exception es la clase padre, la más general.
            System.out.println("¡Error, debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }
        System.out.println("\nnumeroDec = " + numeroDec);
        String resultadoBinario = "El número " + numeroDec + " en binario "
                + Integer.toBinaryString(numeroDec);

        String resultadoOctal = "\nEl número " + numeroDec + " en octal "
                + Integer.toOctalString(numeroDec);

        String resultadoHexadecimal = "\nEl número " + numeroDec + " en hexadecimal " +
                Integer.toHexString(numeroDec);

        //Ventana de dialogo.
        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHexadecimal;
        System.out.println(mensaje);
    }
}
