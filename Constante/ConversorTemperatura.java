package Constante;
import java.util.Scanner;
public class ConversorTemperatura {
    public static final double FATOR_CONGELAMENTO = 0.0;
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("A temperatura em Celsius é: " + celsius);       

        if (celsius <= FATOR_CONGELAMENTO){
            System.out.println("A água está congelada");
        } else {
            System.out.println("A água está líquida");
        }
    }
}
