package Aula12b;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");

    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de Reptil");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}


