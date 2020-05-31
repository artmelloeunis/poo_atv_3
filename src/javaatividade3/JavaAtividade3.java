package javaatividade3;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class JavaAtividade3 {

    public static void main(String[] args) {
        
        float peso;
        float altura;
        float calcularImc;
        String inserePeso;
        String insereAltura;
        
        inserePeso = JOptionPane.showInputDialog("Peso em KG: ");
        peso = Integer.parseInt(inserePeso);
        
        insereAltura = JOptionPane.showInputDialog("Altura em CM: ");
        altura = Integer.parseInt(insereAltura);
        
        calcularImc = (peso / ((altura / 100) * (altura / 100)));
        
        if (calcularImc < 17){
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calcularImc) + " - Muito abaixo do peso");            
        }else if ((calcularImc > 17) && (calcularImc < 18.49)){
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calcularImc) + " - Abaixo do peso");        
        }else if ((calcularImc > 18.50) && (calcularImc < 24.99)){
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calcularImc) + " - Peso normal"); 
        }else if ((calcularImc > 25) && (calcularImc < 29.99)){
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calcularImc) + " - Acima do peso");
        }else if ((calcularImc > 30) && (calcularImc < 34.99)){
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calcularImc) + " - Obesidade 1");
        }else if ((calcularImc > 35) && (calcularImc < 39.99)){
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calcularImc) + " - Obesidade 2 (severa)");
        }else{
            JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calcularImc) + " - Obesidade 3 (mórbida)");
        } 
        
    }
    
}
