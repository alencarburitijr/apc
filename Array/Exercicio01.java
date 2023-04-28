package Array;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // Declaração do array
        int numeros[] = new int[10];
        int menorValor = 9999999;
        int maiorValor = 0;
        Scanner teclado = new Scanner(System.in);
        // Criar uma mensagem para o usuário informar os números
        System.out.println("Seja bem vindo ao armazenador de número no array");
        // Armazenar dentro do array
        for(int i = 0; i < numeros.length; i++){            
            System.out.println("Informe o " + (i + 1) + "º número");
            numeros[i] = teclado.nextInt();            
        }

        // Percorrer o array e verificar qual é o menor valor
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < menorValor){
                menorValor = numeros[i];
            }
            if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
            }
        }
        // Imprimir o menor valor e o maior valor
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("O maior valor é: " + maiorValor);
        
    }
}