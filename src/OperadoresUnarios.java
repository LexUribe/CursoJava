public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("--------------- OPERADORES UNITARIOS ---------------");
        // Operan con el signo de un valor numérico, pudiendo ser este una variable o literal. Invierte el signo del número (int, double, float, etc). Multiplicar por la unidad.
        int i = -5;
        System.out.println("i = " + i);

        int j = +i; // Unario positivo. j = (1)*i => -5
        System.out.println("j = +i => " + j);

        int k = -i; // Unario negativo. k = (-1)*i => 5
        System.out.println("k = -i => " + k);

        i = 6;
        System.out.println("\ni = " + i);

        j = +i;
        System.out.println("j = +i => " + j);

        k = -i;
        System.out.println("k = -i => " + k);
    }
}
