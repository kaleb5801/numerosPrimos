public class Fibonacci {

    public static void fibonacci() {


        int posicion[] = new int[20];
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                c = a + b;
                posicion[i] = c;
            } else {
                c = a + b;
                posicion[i] = c;
                a = b;
                b = c;
            }
        }
        System.out.println("Sucesión de Fibonacci: ");
        for (int h = 0; h < 20; h++) {

            System.out.print(posicion[h]);
            System.out.print(",");
        }
    }
}
