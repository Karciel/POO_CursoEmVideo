package ProjetoPessoas;

public class Funcionario extends Pessoa{

// Atributos:
    private String Setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }

//Métodos Especiais:


    public String getSetor() {
        return Setor;
    }

    public void setSetor(String setor) {
        Setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
