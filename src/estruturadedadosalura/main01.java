package estruturadedadosalura;

public class main01 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(a2));
        Aluno a3 = new Aluno("Pedro");
        System.out.println(lista.contem(a3));

//        Aluno x = lista.pega(158);
//        System.out.println(x);


    }

}
