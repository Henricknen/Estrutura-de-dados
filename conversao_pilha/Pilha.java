public class Pilha {    // classe pilha
    private int valores[];      // vetor para armazenar um conjunto de dados
    private int topo;

    public Pilha() {     // contrutor
        valores = new int[10];      
        topo = -1;      // indica que a pilha esta vazia 
    }

    public void push(int elemento) {    // serve para fazer o empilhamento de um elemento do tipo int
        topo = topo + 1;
        valores[topo] = elemento;
    }

    public boolean isEmpty() {      // verifica se ela esta vazia ou não
        return (topo == - 1);
    }

    public boolean isFull() {       // verifica se ela esta cheia ou não
        return (topo == 9);
    }

    public int pop() {      // que faz o desempilhamento
        int elem = valores[topo];       // recebendo os valores do topo
        topo--;
        return elem;
    }

}