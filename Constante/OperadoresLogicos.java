package Constante;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 15;
        float salario = 2000f;

        if (idade >= 18 && salario >= 1000){
            System.out.println("Pode pegar emprestimo");
        }else if (idade >= 18 || salario >= 1000){            
            System.out.println("Pode pegar emprestimo com fiador");
        }else if (!(idade >= 18 && salario >= 1000)){
            System.out.println("Não pode pegar emprestimo");
        }        
    }
}
