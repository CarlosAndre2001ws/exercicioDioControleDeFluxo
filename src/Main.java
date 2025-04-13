package src;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        int primeiroNum;
        int segundoNum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        primeiroNum = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo parâmetro");
        segundoNum = Integer.parseInt(sc.nextLine());

        try {
            exceptTeste(primeiroNum, segundoNum);
        } catch (InvalidResult e) {
            e.ExecutionException();
        }
    }

    static void exceptTeste(int primeiro, int segundo) throws InvalidResult {
        if (primeiro > segundo){
            throw new InvalidResult();
        }
        int fluxo = segundo - primeiro;

        for (int index = 0; index < fluxo; index++){
            System.out.println("Imprimindo o número " + (index + 1));
        }
    }
    static class InvalidResult extends ExecutionException {
        public void ExecutionException() {
            System.out.println("O segundo parâmetro deve ser maior que o Primeiro");
        }
    }
}