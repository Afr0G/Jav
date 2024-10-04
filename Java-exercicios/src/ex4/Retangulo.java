package ex4;
import javax.swing.JOptionPane;
public class Retangulo {

    float altura,largura,area;


    
    public void Retangulo(){
        
    }
    public void area(){
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura de um retangulo: "));
        this.largura = Float.parseFloat(JOptionPane.showInputDialog("Agora igite a altura desse retangulo: "));
        this.area = this.altura*this.largura;
    }

    public void setInfo(){
        JOptionPane.showMessageDialog(null,"A área desse retangulo é: "+area);
    }
}
