package sempadrao.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    @Test
    void deveCriarJogadorComConstrutorConfuso() {
        // É difícil saber o que cada parâmetro significa sem olhar a classe
        Jogador jogador = new Jogador("Zico", 71, "Flamengo", "Meia", 10, 1.72);
        assertNotNull(jogador.getNome());
    }
}