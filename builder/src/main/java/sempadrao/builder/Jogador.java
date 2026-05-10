package sempadrao.builder;

public class Jogador {
    private String nome;
    private int idade;
    private String clube;
    private String posicao;
    private int numeroCamisa;
    private double altura;

    // O PROBLEMA: Construtor gigante. Se eu quiser criar um jogador sem clube,
    // ou sem altura, preciso de vários construtores ou passar null/zero.
    public Jogador(String nome, int idade, String clube, String posicao, int numeroCamisa, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.clube = clube;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
        this.altura = altura;
    }

    public String getNome() { return nome; }
}