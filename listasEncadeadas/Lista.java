public class Lista {

    private Caixinha inicio;

    public Lista() {       // criando a lista vazia
        this.inicio = null;     // inicialmente a lista não aponta para lugar nenhum
    }

    public void inserir(int elemento) {
        Caixinha nova = new Caixinha();     // para inserir tem que se criar uma nova caixinha
        nova.setElemento(elemento);     // inserindo o elemento na caixinha
        nova.setProximo(null);      // depois dela não vem niguem

        if(inicio == null) {        // vai ser a 1a caixinha?
            inicio = nova;
        } else {        // ja tem gente na lista
            Caixinha aux;
            aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }

    }

    public int retirar() {      // metodo considera que a lista sempre tem elementos
        Caixinha aux = inicio;
        int elemento = aux.getElemento();
        inicio = aux.getProximo();
        return elemento;
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Nada a exibir a lista esta vazia...");
        } else {
            Caixinha aux = inicio;
            while (aux != null) {
                System.out.println("Elemento visto " + aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }
}