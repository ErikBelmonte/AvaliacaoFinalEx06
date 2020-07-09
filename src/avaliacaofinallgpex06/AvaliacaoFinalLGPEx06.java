package avaliacaofinallgpex06;

import javax.swing.JOptionPane;

/**
 * @author Erik
 */
public class AvaliacaoFinalLGPEx06 {
    public static void main(String[] args) {
        int n, r;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a variável N:"));
        
        if (n >= 1){
            r = n * 2;
            JOptionPane.showMessageDialog(null, "O resultado foi de : "+r);
        } else if (n < 0){
            r = 3 * n;
            JOptionPane.showMessageDialog(null, "O resultado foi de : "+r);
        } else {
            JOptionPane.showMessageDialog(null, "Apenas números INTEIROS!!!");
        }
    }
    
}
