import java.util.Scanner;

public class TDetalleDeFactura {
    public static void main(String[] args) {
        System.out.println("----------------------------- FACTURA CON CLASE SCANNER -----------------------------");
        Scanner sc = new Scanner(System.in);
        double precioProducto = 0.0,
                precioSegundoProducto = 0.0,
                precioTotal,
                impuesto,
                totalNeto;

        System.out.println("\nIngresa nombre o descripción de la factura: ");
        String nombreFactura = sc.nextLine();

        try {
            System.out.println("\nIngresa el precio del primer producto: ");
            precioProducto = sc.nextDouble();
            System.out.println("\nIngresa el precio del segundo producto: ");
            precioSegundoProducto = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("\nError al ingresar el precio de los productos, tienen que ser valores numéricos.");
            main(args);
            System.exit(0);
        }

        precioTotal = precioProducto + precioSegundoProducto;
        impuesto = precioTotal * 0.19;
        totalNeto = precioTotal + impuesto;
        String detalle = "\nLa factura " + nombreFactura + " tiene un total bruto de "
                + precioTotal + ", con un impuesto de " + impuesto
                + " y el monto después de impuesto es de " + totalNeto;
        System.out.println(detalle);
        sc.close();
    }
}
