import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        // Usando la clase String.
        /*String username = "Jackson", // Usuario
                password = "123456",
                username1 = "admin", // Administrador
                password1 = "admin";*/

        // Usando un arreglo de String.
        // Primer manera de declarar el arreglo.
        /*String[] usernames = new String[3], // (String[3]). El 3 indica la cantidad de elementos a guardar en el arreglo.
                passwords = new String[3];
        usernames[0] = "Jackson"; // Usuario
        passwords[0] = "123456";

        usernames[1] = "admin"; // Administrador
        passwords[1] = "123456";

        usernames[2] = "pepe"; // Usuario
        passwords[2] = "123456";*/

        // Segunda manera de declarar el arreglo.
        String[] usernames = {"Jackson", "admin", "pepe"},
                passwords = {"1234", "12345", "123456"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite su username: ");
        String user = sc.next();
        System.out.println("Digite su password: ");
        String pass = sc.next();

        boolean autenticado = false;

        // Usando la clase String.
        /*if( (username.equals(user) && password.equals(pass)) ||
                (username1.equals(user) && password1.equals(pass)) ) {
            autenticado = true;
        } else {
            System.out.println("\nEl usuario no existe o la contraseña es incorrecta.");
        }*/

        // Usando un arreglo de String.
        for (int i = 0; i < usernames.length; i++) {
            // Sentencia if, sirve cuando son listas grandes y toca implementar "break" para salir del ciclo for. Listas de 100 elementos o más.
            /*if( (usernames[i].equals(user) && passwords[i].equals(pass))) {
                autenticado = true;
                break;
            }*/

            // Operadores Ternarios, sirve cuando la lista es de 10 elementos o menos.
            autenticado = (usernames[i].equals(user) && passwords[i].equals(pass)) ? true : autenticado;
        }

        // Usando la clase String.
        /*if(autenticado) {
            System.out.println("\nBienvenido a mi App... ".concat(user).concat("!"));
        } else {
            System.out.println("\nNo puede ingresar, ¡Requiere autenticación!.");
        }*/

        // Usando un arreglo de String.
        // Sentencia if, sirve para gran cantidad de elementos.
        /*if(autenticado) {
            System.out.println("\nBienvenido a mi App... ".concat(user).concat("!"));
        } else {
            System.out.println("\nEl usuario no existe o la contraseña es incorrecta.");
            System.out.println("\nNo puede ingresar, ¡Requiere autenticación!.");
        }*/

        // Operadores Ternarios, sirve para pocos elementos.
        String mensaje = autenticado ? "\nBienvenido a mi App... ".concat(user).concat("!") :
                "\nEl usuario no existe o la contraseña es incorrecta." + "\nNo puede ingresar, ¡Requiere autenticación!."; // "\nEl usuario no existe o la contraseña es incorrecta. \nNo puede ingresar, ¡Requiere autenticación!."

        System.out.println("mensaje = " + mensaje);
    }
}
