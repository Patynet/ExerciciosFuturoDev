package ExerciciosSemana1;

import java.util.Scanner;

public class Exercicio4 {
    public Exercicio4() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = " ";
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a opção desejada:  \n[1] Relógio de pulso \n[2] Pulseiras de prata");
        nome = ler.nextLine();
        System.out.println("Escolha o desconto desejado: \n[1] 10% \n[2] 15% \n[3] 20%");
        nome = ler.nextLine();
        System.out.println("O valor a ser pago é de R$50,00! \nParabéns Patricia, compra realizada com sucesso!");
    }
}