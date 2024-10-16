package org.example;

public class NegacaoDaCondicional {

    public static void main(String[] args) {

        System.out.println("Negação da conjunção segundo Morgan!");

        // Mude o valor dos booleanos que sempre dará o mesmo resultado;
        boolean A = true;
        boolean B = false;

        if (A && !B) {
            System.out.println("Negação da condicional: A é verdadeira e B é falsa.");
        } else {
            System.out.println("A implicação (A -> B) é verdadeira.");
        }
    }
}
