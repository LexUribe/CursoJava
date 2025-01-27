import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("Número binario de " + numeroDecimal + " = "
                + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; //0b indica que es un número binario.
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("Número octal de " + numeroDecimal + " = "
                + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; //0 indica que es un número octal.
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Número hexadecimal de " + numeroDecimal + " = " +
                Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4; //0x ó 0X indica que es un número hexadecimal.
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        //Interacción con el usuario.
        System.out.println("\n----------------------------- INTERACTUANDO CON EL USUARIO -----------------------------");
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero"); //Abre ventana de dialogo.

        int numeroDec = 0;
        try {
            numeroDec = Integer.parseInt(numeroStr); //Se convierte a entero (int), ya que es un String.
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }
        System.out.println("\nnumeroDec = " + numeroDec);
        String resultadoBinario = "El número " + numeroDec + " en binario es "
                + Integer.toBinaryString(numeroDec);
        System.out.println(resultadoBinario);

        int numeroBin = 0b111110100; //0b indica que es un número binario.
        System.out.println("numeroBin = " + numeroBin);

        String resultadoOctal = "\nEl número " + numeroDec + " en octal es "
                + Integer.toOctalString(numeroDec);
        System.out.println(resultadoOctal);
        int numeroOct = 0764; //0 indica que es un número octal.
        System.out.println("numeroOct = " + numeroOct);

        String resultadoHexadecimal = "\nEl número " + numeroDec + " en hexadecimal es " +
                Integer.toHexString(numeroDec);
        System.out.println(resultadoHexadecimal);
        int numeroHex = 0x1f4; //0x ó 0X indica que es un número hexadecimal.
        System.out.println("numeroHex = " + numeroHex);

        //Ventana de dialogo.
        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
