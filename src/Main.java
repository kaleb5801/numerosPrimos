public class Main {
    public static void main (String[] args) {
        Primo p = new Primo(20);{
            var primos = p.getPrimos();
            for (int i = 0; i < primos.length; i++) System.out.print(+primos[i] + ",");
            System.out.println("");
        }
        Fibonacci.fibonacci();
    }
}
