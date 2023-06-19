package Aula2;

public class Caneta {

    // (1°) Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // (2°) Métodos
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar, pois a caneta está TAMPADA");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }







}
