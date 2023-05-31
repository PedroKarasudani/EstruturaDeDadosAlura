package listas_ligadas;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultimo = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;
        if (this.totalDeElementos == 0) {
            this.ultimo = this.primeira;
        }
        this.totalDeElementos++;
    }

    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            totalDeElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao){
         return posicao >= 0 && posicao<this.totalDeElementos;
    }
    
    private Celula pegaCelula(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao Inexistente");
        }
        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void adiciona(int posicao, Object elemento) {
        Celula anterior = this.pegaCelula(posicao - 1);
        Celula nova = new Celula(elemento, anterior.getProximo());
        anterior.setProximo(nova);
        totalDeElementos++;
    }

    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao) {
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object o) {
        return false;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }
}
