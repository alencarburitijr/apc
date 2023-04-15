package ListaExercio_14042023;

import javax.swing.JOptionPane;

public class Exercicio02 {
    
    public static void main(String[] args) {
        //Definir variáveis
        int poderGoku;
        int poderVegeta;
        int poderGohan;
        
        //Recebendo dados do usuário
        poderGoku = Integer.parseInt(JOptionPane.showInputDialog("Digite o poder do Goku: "));
        poderVegeta = Integer.parseInt(JOptionPane.showInputDialog("Digite o poder do Vegeta: "));
        poderGohan = Integer.parseInt(JOptionPane.showInputDialog("Digite o poder do Gohan: "));

        //Verificando qual é o mais forte
        if (poderGoku > poderVegeta && poderGoku > poderGohan){
            JOptionPane.showMessageDialog(null, "O Goku é o mais forte");
        }else if (poderVegeta > poderGoku && poderVegeta > poderGohan){
            JOptionPane.showMessageDialog(null, "O Vegeta é o mais forte");
        }else if (poderGohan > poderGoku && poderGohan > poderVegeta){
            JOptionPane.showMessageDialog(null, "O Gohan é o mais forte");
        }else if (poderGoku == poderVegeta && poderGoku == poderGohan){
            JOptionPane.showMessageDialog(null, "Os três são iguais");
        }else if (poderGoku == poderVegeta && poderGoku > poderGohan){
            JOptionPane.showMessageDialog(null, "O Goku e o Vegeta são os mais fortes");
        }else if (poderGoku == poderGohan && poderGoku > poderVegeta){
            JOptionPane.showMessageDialog(null, "O Goku e o Gohan são os mais fortes");
        }else if (poderVegeta == poderGohan && poderVegeta > poderGoku){
            JOptionPane.showMessageDialog(null, "O Vegeta e o Gohan são os mais fortes");
        }        
    }
}
