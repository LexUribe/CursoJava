public class OperadoresIncrementales {
    public static void main(String[] args) {
        System.out.println("--------------- OPERADORES INCREMENTALES ---------------");
        // Pre-incremento: Incrementa en uno, y luego devuelve a. Primero se incrementa y luego se asigna la variable con el valor incrementado.
        System.out.println("\nPRE-INCREMENTO");
        int i = 1;
        System.out.println("Valor inicial de i = " + i);
        int j = ++i; // i = i + 1. El incremento va a la izquierda de la variable.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-incremento: Devuelve a, y luego incrementa a en uno. Primero se asigna la variable con el valor antes de incrementar, por lo tanto (j = 2). Luego se incrementa.
        System.out.println("\nPOST-INCREMENTO");
        i = 2;
        System.out.println("Valor inicial de i = " + i);
        j = i++; // El incremento va a la derecha de la variable.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre-decremento: Decrementa a en uno, luego devuelve a. Se asigna la variable con el valor decrementado.
        System.out.println("\nPRE-DECREMENTO");
        i = 3;
        System.out.println("Valor inicial de i = " + i);
        j = --i; // i = i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-decremento: Devuelve a, luego decrementa a en uno. Se asigna la variable antes del decremento.
        System.out.println("\nPOST-DECREMENTO");
        i = 4;
        System.out.println("Valor inicial de i = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("\n\n(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
    }
}
