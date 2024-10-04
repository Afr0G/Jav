package ex1;

public class Pessoa{
    static String nome;
    static int idade;

    public Pessoa(int idade, String nome){
        this.idade=idade;
        this.nome=nome;
    }

    public void mensagem(){
        System.out.println("olá, meu nome é "+nome+" eu tenho "+idade+" anos.");
    }

    
}
