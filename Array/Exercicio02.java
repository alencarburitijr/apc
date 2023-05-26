package Array;

import java.util.Scanner;

/* Crie um programa que leia 20 números inteiros e
verifique se é impar ou par. 
Adicione cada número em um array específico para
impar e outro para par. Ao final, imprima os valores

Com o array de inteiros criado, crie um novo 
arry e insira os números pares e depois os números 
impares. Imprima o array resultante.
*/
public class Exercicio02 {

    public static void main(String [] args){
        int tamanhoArray = 5;
        int numeros[] = new int[tamanhoArray];
        int par[] = new int[tamanhoArray];
        int impar[] = new int[tamanhoArray];
        int novoArray[] = new int[tamanhoArray];
        int numero;
        int aux;
        int auxPar = 0;
        int auxImpar = 0;
        
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < tamanhoArray; i++){
            System.out.println("Informe o " + (i+1) + "º");
            numeros[i] = teclado.nextInt();            
        }

        for(int i = 0; i < tamanhoArray; i++){            
            if(numeros[i] % 2 == 0){
                par[auxPar] = numeros[i];
                auxPar++;
            }
        }

        for(int i = 0; i < tamanhoArray; i++){            
            if(numeros[i] % 2 != 0){
                impar[auxImpar] = numeros[i];
                auxImpar++;
            }
        }

        for(int i = 0; i < tamanhoArray;i++){
            System.out.println("Número par: " + par[i]);
        }
        for(int i = 0; i < tamanhoArray;i++){
            System.out.println("Número impar: " + impar[i]);
        }

        for(int i = 0; i < tamanhoArray; i++){
            novoArray[i] = par[i];
        }
        for(int i = 0; i < tamanhoArray; i++){
            if (impar[i] != 0){
                novoArray[auxPar] = impar[0];
            }
        }
        System.out.println("Meu novo array é");
        for(int i = 0; i < tamanhoArray;i++){
            System.out.println(i + "º Posição: " + novoArray[i]);
        }
    }
}
