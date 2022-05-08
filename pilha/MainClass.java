public class MainClass {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);
        p.push(0);

        while(!p.isEmpty()) {       // enquanto a pilha não estiver vazia
            int elemento = p.pop();
            System.out.println("Desempilhei " + elemento);
        }

        int e = p.pop();
    }
}