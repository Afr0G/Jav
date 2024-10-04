package ex6;
import javax.swing.JOptionPane;
public class Funcionario {
    String nome;
    float salario,aumentoSalario,sFinal;

    public void aumento(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
        this.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário"));
        this.aumentoSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite o aumento do salario desse funcionário(%): "));
        this.sFinal = this.salario+(this.salario*(this.aumentoSalario/100));
    }
    public void setInfo(){
        JOptionPane.showMessageDialog(null,"O salário final deste funcionário é: "+sFinal);
    }
}
