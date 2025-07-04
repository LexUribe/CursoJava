import java.util.Scanner;

public class DetalleDeFacturaT2 {
    public static void main(String[] args) {
        /*
         * Tarea 2: Detalle de la factura. SECCIÓN 2: VARIABLES.
         *
         * La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se
         * requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la
         * siguiente manera:
         *
         *   1. Reciba el nombre de la factura o descripción, utilizar método nextLine() para
         *      obtener el nombre de la factura con espacios.
         *
         *   2. Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para
         *      obtener precios con decimales (,).
         *
         *   3. Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%.
         *
         * Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de
         * impuesto), el impuesto y el monto total neto incluyendo impuesto.
         *
         * Por ejemplo, el resultado podría ser algo así:
         * La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de
         * 25.6082 y el monto después de impuesto es de 160.3882.
         * */

        Scanner sc = new Scanner(System.in);

        // 1. Reciba el nombre de la factura o descripción, utilizar método nextLine().
        System.out.println("Ingrese el nombre o descripción para la factura: ");
        String nombre = sc.nextLine();

        // 2. Reciba 2 precios de productos de tipo double, utilizar método nextDouble()
        System.out.println("Ingrese el precio del primer producto: ");
        double precio = sc.nextDouble();

        System.out.println("Ingrese el precio del segundo producto: ");
        double precio1 = sc.nextDouble();

        // 3. Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%.
        double totalBruto = precio + precio1,
                impuesto = totalBruto * 0.19,
                totalNeto = totalBruto + impuesto;

        // Mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
        System.out.println("------------------------------------ DETALLE DE FACTURA " + nombre.toUpperCase() + " ------------------------------------");

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto + ", con un impuesto de " +
                impuesto + " y el monto después de impuesto es de " + totalNeto + ".";
        System.out.println(detalle);
    }
}
