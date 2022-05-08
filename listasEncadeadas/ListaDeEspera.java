public class ListaDeEspera {
    public static void main(String args[]) {
        Lista lista = new Lista();
        lista.inserir(100);
        lista.inserir(451);
        lista.inserir(6781);
        lista.inserir(1575);

        while (!lista.isEmpty()) {
            int e = lista.retirar();
            System.out.println("Retirei o elemento " + e);
        }
    }
}