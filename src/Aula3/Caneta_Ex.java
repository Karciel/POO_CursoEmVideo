package Aula3;


    public class Caneta_Ex {

        // (1°) Atributos
      public String modelo;
      public  String cor;
      private float ponta;
      protected int carga;
      protected boolean tampada;

        // (2°) Métodos
      public void status() {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Uma caneta " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("Está tampada? " + this.tampada);
        }
      public void rabiscar() {
            if (this.tampada == true) {
                System.out.println("ERRO! Não posso rabiscar, pois a caneta está TAMPADA");
            } else {
                System.out.println("Estou rabiscando...");
            }
        }

      protected void tampar() {
            this.tampada = true;
        }

      protected void destampar() {
            this.tampada = false;
        }







    }



