package ex3;

import javax.swing.JOptionPane;

public class Calculadora {
    float n1,n2;
    float somas;

    public Calculadora(){
    }
    public void setInfo(){
        
        this.n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o número primeiro número: "));
        this.n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o número segundo número: "));
        this.somas=this.n1+this.n2;
        

    }
    public void soma(){
        JOptionPane.showMessageDialog(null, "A soma desses números é:"+somas);
    }
}
