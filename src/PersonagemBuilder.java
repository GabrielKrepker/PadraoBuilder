public class PersonagemBuilder {

    private Personagem personagem;

    public PersonagemBuilder() {
        personagem = new Personagem();
    }

    public Personagem build() {
        if (personagem.getId() == 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        if (personagem.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (personagem.getClasse() == null || personagem.getClasse().equals("")) {
            throw new IllegalArgumentException("Classe inválida");
        }
        return personagem;
    }

    public PersonagemBuilder setId(int id) {
        personagem.setId(id);
        return this;
    }

    public PersonagemBuilder setNome(String nome) {
        personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder setClasse(String classe) {
        personagem.setClasse(classe);
        return this;
    }

    public PersonagemBuilder setNivel(int nivel) {
        personagem.setNivel(nivel);
        return this;
    }

    public PersonagemBuilder setForca(int forca) {
        personagem.setForca(forca);
        return this;
    }

    public PersonagemBuilder setMagia(int magia) {
        personagem.setMagia(magia);
        return this;
    }

    public PersonagemBuilder setDefesa(int defesa) {
        personagem.setDefesa(defesa);
        return this;
    }

    public PersonagemBuilder setArma(String arma) {
        personagem.setArma(arma);
        return this;
    }

    public PersonagemBuilder setArmadura(String armadura) {
        personagem.setArmadura(armadura);
        return this;
    }

    public PersonagemBuilder setGuilda(String guilda) {
        personagem.setGuilda(guilda);
        return this;
    }

    public PersonagemBuilder setServidor(String servidor) {
        personagem.setServidor(servidor);
        return this;
    }
}