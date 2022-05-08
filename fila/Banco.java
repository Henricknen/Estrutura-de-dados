public class Banco {
    public static void main(String args[]) {
        Fila f;
        int e;
        f = new Fila();

        f.inserir(234);
        f.inserir(2334);
        f.inserir(1784);
        f.inserir(432);
        f.inserir(1056);

        System.out.println("Banco LHSF...");
        System.out.println("Seja bem vindo");
        System.out.println("Atendimento...");

        while (!f.isEmpty()) {
            e = f.retirar();
            System.out.println("Proxima senha é: " + e);
        }
    }
}