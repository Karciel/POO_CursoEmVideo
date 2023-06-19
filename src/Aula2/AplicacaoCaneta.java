package Aula2;

public class AplicacaoCaneta {
    public static void main(String[] args) {
        // Criando a primeira caneta
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();


        // Criando uma segunda caneta:
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
