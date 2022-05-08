public class Fila {
    private int valores[];
    private int inicio;
    private int fim;
    private int total;

    public Fila() {     // contrutor
        valores = new int[10];
        inicio = 0;
        fim = 0;        // inicio e fim apontando pra primeira posição 0
        total = 0;
    }

    public void inserir(int elemento) {
        valores[fim] = elemento;
        fim = (fim + 1) % valores.length;
        total++;
    }

    public int retirar() {
        int elemento = valores[inicio];
        inicio = (inicio + 1) % 10;
        total--;
        return elemento;
    }

    public boolean isEmpty() {
        return (total == 0);        // se total for igual a 0 retorna true
    }

    public boolean isFull() {
        return (total == 10);
    }

}