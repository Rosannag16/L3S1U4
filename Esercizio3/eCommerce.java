package Esercizio3;

import java.util.ArrayList;
import java.util.List;

public class eCommerce {
    public static void main(String[] args) {
        // Creazione di alcuni articoli
        Articolo articolo1 = new Articolo("A001", "Smartphone", 599.99, 10);
        Articolo articolo2 = new Articolo("A002", "Laptop", 999.99, 5);

        // Creazione di un cliente
        Cliente cliente1 = new Cliente("C001", "Mario", "Rossi", "mario@example.com", "2024-04-17");

        // Creazione di un carrello per il cliente
        Carrello carrelloCliente1 = new Carrello(cliente1);

        // Aggiunta di articoli al carrello
        carrelloCliente1.aggiungiArticolo(articolo1);
        carrelloCliente1.aggiungiArticolo(articolo2);

        // Stampa dei dati del carrello
        System.out.println("Carrello del cliente " + cliente1.getNome() + " " + cliente1.getCognome() + ":");
        List<Articolo> elencoArticoli = carrelloCliente1.getElencoArticoli();
        for (Articolo articolo : elencoArticoli) {
            System.out.println("Codice: " + articolo.getCodiceArticolo() + ", Descrizione: " + articolo.getDescrizione() +
                    ", Prezzo: " + articolo.getPrezzo() + ", Pezzi disponibili: " + articolo.getPezziDisponibili());
        }
        System.out.println("Totale: " + carrelloCliente1.getTotaleCostoArticoli());
    }
}

class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(String codiceArticolo, String descrizione, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }
}

class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String codiceCliente, String nome, String cognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }
}

class Carrello {
    private Cliente clienteAssociato;
    private List<Articolo> elencoArticoli;
    private double totaleCostoArticoli;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new ArrayList<>();
        this.totaleCostoArticoli = 0;
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public List<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }

    public double getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public void aggiungiArticolo(Articolo articolo) {
        elencoArticoli.add(articolo);
        totaleCostoArticoli += articolo.getPrezzo();
    }

    public void rimuoviArticolo(Articolo articolo) {
        elencoArticoli.remove(articolo);
        totaleCostoArticoli -= articolo.getPrezzo();
    }
}
