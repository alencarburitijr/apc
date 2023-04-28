package Array;

public class ExemploArray {
    public static void main(String []args){
        int tamanhoArray = 20;
        // Declarando um array de inteiros
        int fila [] = new int[tamanhoArray];
        // Atribuindo valores ao array
        fila[0] = 10;
        fila[1] = 20;
        fila[2] = 30;
        fila[3] = 40;
        // Imprimindo o tamanho do array
        System.out.println("Tamanho do array: " + fila.length);
        // Imprimindo os valores do array
        for(int i = 0; i < 50; i++){
            System.out.println(fila[i]);
        }
    }    
}
