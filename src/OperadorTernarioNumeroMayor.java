import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0; // Variable bandera para guardar el número mayor de cada cálculo.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num = sc.nextInt(); // Otra alternativa es Integer.parseInt(sc.nextLine()) ó Integer.parseInt(sc.next())

        System.out.println("Ingrese el segundo número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el cuarto número: ");
        int num3 = sc.nextInt();

        max = num > num1 ? num : num1;
        max = max > num2 ? max : num2;
        max = max > num3 ? max : num3;

        System.out.println("\nnum1 = " + num);
        System.out.println("num2 = " + num1);
        System.out.println("num3 = " + num2);
        System.out.println("num4 = " + num3);
        System.out.println("El número mayor es: " + max);
    }
}
