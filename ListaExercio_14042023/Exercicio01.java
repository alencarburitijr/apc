package ListaExercio_14042023;

import java.util.Scanner;

/*Crie um algoritmo que solicite ao usuário que digite sua idade e altura 
em metros, e em seguida, use dois operadores lógicos para avaliar
se a pessoa atende aos requisitos.

Caso a idade seja maior ou igual a 18 e a altura seja maior ou 
igual a 1,7 metros, o programa exibe a mensagem
"Você é maior de idade e tem altura suficiente". 

Cao apenas uma das condições for verdadeira, o programa exibe a 
mensagem 
"Você é maior de idade ou tem altura suficiente".

Caso contrário, o programa exibe a mensagem 
"Você é menor de idade e não tem altura suficiente" */

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        double altura;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();
        
        if (idade >= 18 && altura >= 1.7){
            System.out.println("Você é maior de idade e tem altura suficiente");
        }else if (idade >= 18 || altura >= 1.7){            
            System.out.println("Você é maior de idade ou tem altura suficiente");
        }else if (!(idade >= 18 && altura >= 1.7)){
            System.out.println("Você é menor de idade e não tem altura suficiente");
        }        
    }
}
