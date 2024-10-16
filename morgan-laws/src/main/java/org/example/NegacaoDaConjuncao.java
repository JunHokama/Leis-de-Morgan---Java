package org.example;

public class NegacaoDaConjuncao {
    public static void main(String[] args) {

        System.out.println("Negação da conjunção segundo Morgan!");

        // Mude o valor dos booleanos que sempre dará o mesmo resultado;
        boolean A = true;
        boolean B = true;


        boolean negacaoDaConjuncao = !(A && B);

        boolean equivalenteDaNegacaoDaConjuncao = (!A || !B);

        if (equivalenteDaNegacaoDaConjuncao == negacaoDaConjuncao) {
            System.out.println("A Lei de De Morgan está correta!");
        } else {
            System.out.println("Algo está errado!");
        }
    }
}