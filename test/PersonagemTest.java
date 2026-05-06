import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveCriarPersonagemValido() {
        Personagem personagem = new PersonagemBuilder()
                .setId(1)
                .setNome("Guerreiro")
                .setClasse("Tank")
                .setNivel(10)
                .setForca(20)
                .setDefesa(30)
                .build();

        assertEquals(1, personagem.getId());
        assertEquals("Guerreiro", personagem.getNome());
        assertEquals("Tank", personagem.getClasse());
    }

    @Test
    void deveLancarExcecaoParaIdInvalido() {
        try {
            new PersonagemBuilder()
                    .setNome("Mago")
                    .setClasse("DPS")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ID inválido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoParaNomeInvalido() {
        try {
            new PersonagemBuilder()
                    .setId(1)
                    .setClasse("DPS")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoParaClasseInvalida() {
        try {
            new PersonagemBuilder()
                    .setId(1)
                    .setNome("Arqueiro")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Classe inválida", e.getMessage());
        }
    }
}