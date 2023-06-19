package Aula12b;

public class Ave extends Animal {
public String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");

    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de Ave");

    }
    public void fazerNinho() {
        System.out.println("Construindo Ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
