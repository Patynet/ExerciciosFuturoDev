//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ExerciciosSemana1;

public class exercicioTabuada {
    public exercicioTabuada() {
    }

    public static void main(String[] args) {
        int numero = 5;
        String resposta = "S";
        if (numero < 12) {
            System.out.println(numero * 1);
            System.out.println(numero * 2);
            System.out.println(numero * 3);
            System.out.println(numero * 4);
            System.out.println(numero * 5);
            System.out.println(numero * 6);
            System.out.println(numero * 7);
            System.out.println(numero * 8);
            System.out.println(numero * 9);
            System.out.println(numero * 10);
        } else if (numero > 12 && resposta == "S") {
            System.out.println(numero * 2);
        } else if (numero > 12 && resposta == "N") {
            System.out.println(numero + 15);
        } else if (numero == 12) {
            System.out.println("meia duzia!");
        }

    }
}