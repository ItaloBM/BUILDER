package padroescriacao.builder;

public class Jogador {
    private String nome;
    private int idade;
    private String clube;
    private String posicao;
    private int numeroCamisa;
    private double altura;

    // Construtor privado: só o Builder pode usar!
    private Jogador() {}

    public String getNome() { return nome; }
    public String getClube() { return clube; }
    public int getNumeroCamisa() { return numeroCamisa; }

    // A classe Builder interna
    public static class Builder {
        private Jogador jogador;

        public Builder() {
            this.jogador = new Jogador();
        }

        public Builder setNome(String nome) {
            this.jogador.nome = nome;
            return this;
        }

        public Builder setIdade(int idade) {
            this.jogador.idade = idade;
            return this;
        }

        public Builder setClube(String clube) {
            this.jogador.clube = clube;
            return this;
        }

        public Builder setPosicao(String posicao) {
            this.jogador.posicao = posicao;
            return this;
        }

        public Builder setNumeroCamisa(int numeroCamisa) {
            this.jogador.numeroCamisa = numeroCamisa;
            return this;
        }

        public Builder setAltura(double altura) {
            this.jogador.altura = altura;
            return this;
        }

        public Jogador build() {
            if (this.jogador.nome == null || this.jogador.nome.equals("")) {
                throw new IllegalArgumentException("Nome do jogador é obrigatório");
            }
            return this.jogador;
        }
    }
}