package Desafio1;

public class Televisao {

    // Atributos:

    String marca;
    int polegadas;
    String painel;
    float preco;

    boolean desligada;


    // Metodos:

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Polegadas: " + this.polegadas);
        System.out.println("Painel: " + this.painel);
        System.out.println("preço: " + this.preco + " R$");
        System.out.println("Está desligada? " + this.desligada);
    }

    void filme() {
        if (!this.desligada) {
            System.out.println("Vamo botar um filme então!");
        } else {
            System.out.println("Ah, então eu vou dormir!");
        }
    }

        void ligar () {
            this.desligada = false;
        }

        void desligar () {
            this.desligada = true;
        }



}
