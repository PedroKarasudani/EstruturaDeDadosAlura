package estruturadedadosalura;

import java.util.ArrayList;

public class main01 {

    public static void main(String[] args) {
        //criando o aluno Joao e Jose
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        
        //criando o objeto Lista
        Vetor lista = new Vetor();

        //adicionando Joao e Jose na lista e mostrando o tamanho da lista e 
        //no final os nomes que compoe a lista
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());
        System.out.println(lista);

        //mostrando o metodo contem, o a3(Pedro) nao foi adicionado na lista
        //por isso na hora da verificacao retornou false
        System.out.println(lista.contem(a2));
        Aluno a3 = new Aluno("Pedro");
        System.out.println(lista.contem(a3));

//        Aluno x = lista.pega(158);
//        System.out.println(x);
//
        //adicionando Pedro na lista
        lista.adiciona(2, a3);
        System.out.println(lista);
        
        //removendo Jose
        lista.remove(1);
        System.out.println(lista);
        
        
        //adicionando 300 Lucas, e mostrando que automaticamente dobra o numero da lista
        for (int i = 0; i < 300; i++) {
           Aluno y  = new Aluno("Lucas" + i);
           lista.adiciona(y);
        }
        
        System.out.println(lista);
   
    
    // mostrando que ja existe uma classe do java parecida com a que criamos 
//        ArrayList<Aluno> listaDoJavas = new ArrayList<Aluno>();
//        listaDoJavas.add(a3);
    
    }  
}
