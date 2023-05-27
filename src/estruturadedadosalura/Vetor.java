package estruturadedadosalura;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;
    
    private void garanteEspaco(){
        if(totalDeAlunos == alunos.length){
            Aluno[] novaArray = new Aluno[alunos.length*2];
            for(int i=0; i<alunos.length; i++){
                novaArray[i]= alunos[i];
            }
            this.alunos = novaArray;
        }
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totalDeAlunos;
    }
    
    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }
    
    public void adiciona(int posicao, Aluno aluno) {
        this.garanteEspaco();
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = totalDeAlunos - 1; i >= posicao; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        return alunos[posicao];
    }

    public void remove(int posicao) {
        for(int i = posicao; i < this.totalDeAlunos -1; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--;
        this.alunos[totalDeAlunos] = null;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }

}
