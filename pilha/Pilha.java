public class Pilha {

    int elementos[];      // vetor que vai armazena os elementos
    int topo;       // indice que indica em qual posicao desse vetor esta o ultimo elemento armazenado  

    public Pilha() {        // contrutor, e o que faz toda a inicializacao
        elementos = new int[10];        // nesta pilha de tamanho fixo e limitado cabe 10 elementos do tipo inteiro
        topo = -1;      //posicao invalida do vetor
    }

    public void push(int e) {
        if (isFull()) {     // se a pilha estiver cheia
            throw new RuntimeException("Stack Overflow!");
        }
        topo++;
        elementos[topo] = e;
    }

    public int pop() {
        if (isEmpty()) {    // se a pliha estiver vazia
            throw new RuntimeException("Empty Stack!");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty() {      // verifica se esta vazia ou nao
        return (topo == -1);
    }

    public boolean isFull() {        // verifica se esta cheia ou nao
        return (topo == 9);
    }

    public int top() {      // retorna o elemento do topo
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack!");
        }
        return elementos[topo];
    }

}