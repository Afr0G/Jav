package ex2;

import javax.swing.JOptionPane;

public class Cachorro {
    String nome,raca;

    public Cachorro(){
       
    }
    public void latir(){
       
        JOptionPane.showMessageDialog(null, "Au Au!");
    }
    public void setInfo(){
        this.nome =  JOptionPane.showInputDialog ("Entre com o nome ");
        this.raca =  JOptionPane.showInputDialog ("Entre com a raca ");
    }


}
