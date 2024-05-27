package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
    
        System.out.println("Digite o primeiro número:");
        int parametroUm = input.nextInt();

        System.out.println("Digite o segundo número:");
        int parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
    
        for(int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
    