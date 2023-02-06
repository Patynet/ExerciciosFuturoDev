package ExerciciosSemana1;

public class Exercicio5 {
    public Exercicio5() {
    }

    public static void main(String[] args) {
        System.out.println("Desejo verificar 10 números da sequencia de Fibonacci!");
        int a = 1;
        int b = 0;

        for(int i = 0; i < 10; ++i) {
            System.out.println(a);
            int aux = a;
            a += b;
            b = aux;
        }

    }
}
