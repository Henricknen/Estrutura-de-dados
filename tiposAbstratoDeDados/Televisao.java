public class Televisao {
    String marca;
    boolean ligado;
    int volume;
    int canal;

    public Televisao() {        // contrutor criando Televisao
        ligado = false;     // criando Televisao deligada        
    }

    public void ligar() {
        ligado = true;
        System.out.println("TV " + marca + " ligada!");
    }

    public void desligar() {
        System.out.println("Desligando TV " + marca);
        ligado = false;
    }

    public void defineMarca(String nomeMarca) {
        marca = nomeMarca;
        System.out.println("TV - Marca definida: " + marca);
    }

    public void defineVolume(int vol) {
        if (ligado) {
            volume = vol;
            System.out.println("TV " + marca + " volume definido para " + volume);
        } else {
            System.out.println("Por favor, ligue antes a TV " + marca);
        }
    }

    public void defineCanal(int ca) {
        if (ligado) {
            canal = ca;
            System.out.println("TV " + marca + " com canal definido para " + canal);
        } else {
            System.out.println("Por favor, ligue antes a TV " + marca);
        }
    }

    public void aumentaVolume() {
        volume ++;
        System.out.println("TV " + marca + ": volume atual " + volume);
    }
}