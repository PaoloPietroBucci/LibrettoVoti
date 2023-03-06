package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiungi un nuovo voto al libretto
	 * @param v voto da aggiugere
	 * @return true
	 */
	
	public boolean add(Voto v) {
		return this.voti.add(v); //delga cieca (nessun controllo)
						  //ma il metodo add di Libretto delega l'aggiunta ad add della lista
	}
	
	public void stampa() {
		for (Voto v : this.voti) {
			System.out.println(v);
		}
	}
		
	public void stampaPerVoto(int punti) {
		for (Voto v : this.voti) {
			if (v.getPunti()==punti) {
			System.out.println(v);
			}
		}
	}
	public Voto stampaPerNome(String nomeCorso) {
		for (Voto v : this.voti) {
			if (v.getNomeCorso().compareTo(nomeCorso)==0) {
			return v;
			}
		}
		return null;
		//throw new RuntimeException ("Voto non trovato");
	}
	public boolean esisteVoto (Voto nuovo) {
		for (Voto v : this.voti) {
			if (v.getNomeCorso().equals(nuovo.getNomeCorso()) && v.getPunti()==nuovo.getPunti()) {
				return true;
			}
		}
		return false;
	}

}
