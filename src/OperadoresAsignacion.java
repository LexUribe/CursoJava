public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("--------------- OPERADORES DE ASIGNACIÓN ---------------");
        int i = 5,
                j = i + 4;
        System.out.println("Variables"); // Valor inicial de las variables a utilizar.
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("\nOperaciones");
        // Abreviación para la suma +=.
        System.out.println("SUMA");
        i += 2; // i = i + 2; es lo mismo que escribir i += 2;
        System.out.println("i += 2 = " + i);

        i += 5; // i = i + 5;
        System.out.println("i += 5 = " + i);

        // Abreviación para la resta -=.
        System.out.println("\nRESTA");
        j -= 4; // j = j - 4;
        System.out.println("j -= 4 = " + j);

        // Abreviación para la multiplicación *=.
        System.out.println("\nMULTIPLICACIÓN");
        j *= 3; // j = j * 3;
        System.out.println("j *= 3 = " + j);

        // Abreviación para una consulta SQL +=.
        System.out.println("\nCONSULTA SQL");
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Andres'";
        sqlString += " and c.activo = 1";
        System.out.println("sqlString = " + sqlString);
    }
}
