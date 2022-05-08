public class Caixinha {
    private int elemento;
    private Caixinha proximo;

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getElemento() {
        return this.elemento;
    }

    public void setProximo(Caixinha proximo) {
        this.proximo = proximo;
    } 

    public Caixinha getProximo() {
        return this.proximo;
    }
}