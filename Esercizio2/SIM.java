package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double creditoDisponibile;
    private List<Chiamata> ultimeChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 10;
        this.ultimeChiamate = new ArrayList<>();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public List<Chiamata> getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        ultimeChiamate.add(chiamata);
        if (ultimeChiamate.size() > 5) {
            ultimeChiamate.remove(0); // Rimuovi la chiamata più vecchia se ci sono più di 5 chiamate
        }
    }

    public void stampaSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile);
        System.out.println("Ultime chiamate:");
        for (Chiamata chiamata : ultimeChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", Durata: " + chiamata.getDurata() + " minuti");
        }
    }

    public static void main(String[] args) {
        SIM sim = new SIM("123456789");
        sim.stampaSIM();
    }
}

class Chiamata {
    private String numeroChiamato;
    private int durata; // in minuti

    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }
}
