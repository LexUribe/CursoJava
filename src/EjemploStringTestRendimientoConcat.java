public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // La clase StringBuilder sirve para crear un String. Es mutable.

        //Mediciones temporales.
        //Medida temporal.
        long inicio = System.currentTimeMillis(); // Función de la clase System para tomar el tiempo en milisegundos.

        for (int i = 0; i < 100000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 1ms-2ms, 1000 => 4ms-5ms, 10000 => 124ms-132ms, 100000 => 6775ms-7573ms
            //c += a + b + "\n"; // 500 => 15ms-18ms, 1000 => 17ms-19ms, 10000 => 72ms-76ms, 100000 => 2409ms-2611ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 1ms, 100000 => 9ms-11ms
        }

        //Medida temporal.
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}