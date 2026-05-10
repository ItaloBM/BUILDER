package padroescriacao.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveCriarJogadorComSucesso() {
        Jogador jogador = new Jogador.Builder()
                .setNome("Zico")
                .setClube("Flamengo")
                .setNumeroCamisa(10)
                .setPosicao("Meia")
                .build();

        assertEquals("Zico", jogador.getNome());
        assertEquals("Flamengo", jogador.getClube());
        assertEquals(10, jogador.getNumeroCamisa());
    }

    @Test
    void deveRetornarExcecaoParaJogadorSemNome() {
        try {
            Jogador jogador = new Jogador.Builder()
                    .setClube("Flamengo")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do jogador é obrigatório", e.getMessage());
        }
    }
}