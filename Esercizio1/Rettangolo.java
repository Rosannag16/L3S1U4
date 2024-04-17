package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();
        System.out.println("Rettangolo 2:");
        rettangolo2.stampaRettangolo();
        System.out.println("Somma delle aree: " + (rettangolo1.calcolaArea() + rettangolo2.calcolaArea()));
        System.out.println("Somma dei perimetri: " + (rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro()));
    }

    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3, 7);
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
