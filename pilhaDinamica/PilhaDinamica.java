public class PilhaDinamica {
    private Caixinha topo;

        public PilhaDinamica() {
            topo = null;
        }

        public void push(int elemento) {    // colocando elementos na pilha
            Caixinha novo = new Caixinha();
            novo.setElemento(elemento);
            novo.setProximo(topo);

            topo = novo;
        }

        public int pop() {
            int elemento = topo.getElemento();
            topo = topo.getProximo();
            return elemento;
        }

        public boolean isEmpty() {
            return (topo == null);
        }

}