public class Casa {
    public static void main(String args[]) {
        Televisao t1, t2;

        t1 = new Televisao();
        t2 = new Televisao();

        t1.defineMarca("Sansung da cozina");
        t2.defineMarca("Sansung do quarto");

        t1.ligar();
        t2.ligar();

        t1.defineCanal(10);
        t1.defineVolume(20);

        t2.defineCanal(10);
        t2.defineCanal(13);
        t2.defineCanal(7);
        t2.defineCanal(4);
        t2.defineVolume(1);

        t1.desligar();
        t2.desligar();


    }
}