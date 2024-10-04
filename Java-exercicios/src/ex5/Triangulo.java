package ex5;
import javax.swing.JOptionPane;
public class Triangulo {
    float base,altura,area;

    public void area(){
        this.base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base de um triangulo: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Agora digite a altura desse triangulo: "));
        this.area = (this.altura*this.base)/2;
    }
    public void setInfo(){
        JOptionPane.showMessageDialog(null, "A área deste triangulo é: "+area);
    }
}
