package ProjetoPessoas;

public class AplicacaoProjetoPessoas {
    public static void main(String[] args) {


//ProgramaPrincipal:

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        //Nome
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        //Sexo
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        //Idade
        p1.setIdade(28);
        p2.setIdade(42);
        p3.setIdade(77);
        p4.setIdade(53);


        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.receberAumento(550.20f);



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());






    }


}
