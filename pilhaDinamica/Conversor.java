public class Conversor {
    public static void main(String args []) {
        int numero = Integer.parseInt(args[0]);     // recebendo o primeiro elemento do vetor
        PilhaDinamica p = new PilhaDinamica();      // criando uma pilha p

        int resto;

        // empilhamento dos restos
        while (numero != 0) {
            resto = numero % 2;     // pegando o resto da divisão = 0 ou 1
            p.push(resto);      // armazenando na pilha
            numero = numero / 2;     // gerando novo numero, resultado d divisão por 2
        }

        // exibição dos restos
        while (!p.isEmpty()) {
            resto = p.pop();        // remove da pilha o elemento que estiver no topo
            System.out.print(resto);
        }
        System.out.println("\nFim do programa");
    }
}