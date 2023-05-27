package estruturadedadosalura;

import java.util.Arrays;


public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;
   
    public void adiciona(Aluno aluno){
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }
    
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }
    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return alunos[posicao];
    }
    
    public void remove(int posicao){
        
    }
    
    public boolean contem(Aluno aluno){
        for(int i = 0; i < totalDeAlunos; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalDeAlunos;
    }
    
    public String toString(){
        return Arrays.toString(alunos);
    }
    
}
