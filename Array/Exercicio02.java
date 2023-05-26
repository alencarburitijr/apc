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

    static int tamanhoArray = 5;
    static int auxPar = 0;
    static int auxImpar = 0;
    static int par[] = new int[tamanhoArray];
    static int numeros[] = new int[tamanhoArray];
    static int impar[] = new int[tamanhoArray];
    static int novoArray[] = new int[tamanhoArray];
    static int numero;
    static int aux;
    public static void main(String [] args){
        
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < tamanhoArray; i++){
            System.out.println("Informe o " + (i+1) + "º");
            numeros[i] = teclado.nextInt();            
        }

        getPar(numeros, tamanhoArray);

        getImpar(numeros, tamanhoArray);
        
        imprimirArray();

        juntarArray();
        
        System.out.println("Meu novo array é");
        for(int i = 0; i < tamanhoArray;i++){
            System.out.println(i + "º Posição: " + novoArray[i]);
        }
    }

    public static void getPar(int[] numeros, int tamanhoArray){
        for(int i = 0; i < tamanhoArray; i++){            
            if(numeros[i] % 2 == 0){
                par[auxPar] = numeros[i];
                auxPar++;
            }
        }
    }

    public static void getImpar(int[] numeros, int tamanhoArray){
        for(int i = 0; i < tamanhoArray; i++){            
            if(numeros[i] % 2 != 0){
                impar[auxImpar] = numeros[i];
                auxImpar++;
            }
        }
    }

    public static void imprimirArray(){
        for(int i = 0; i < tamanhoArray;i++){
            System.out.println("Número par: " + par[i]);
        }
        for(int i = 0; i < tamanhoArray;i++){
            System.out.println("Número impar: " + impar[i]);
        }
    }

    public static void juntarArray(){
        for(int i = 0; i < tamanhoArray; i++){
            novoArray[i] = par[i];
        }

        for(int i = 0; i < tamanhoArray; i++){
            if (impar[i] != 0){
                novoArray[auxPar] = impar[0];
            }
        }
    }
}
