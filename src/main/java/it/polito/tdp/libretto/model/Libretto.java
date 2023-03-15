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
		if (this.esisteVotoDuplicato(v) || this.esisteVotoInConflitto(v)){
			throw new IllegalArgumentException("Voto errato: "+ v);
		}
		else return this.voti.add(v);
		
		
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
	public boolean esisteVotoDuplicato (Voto nuovo) {
		for (Voto v : this.voti) {
			if (v.isDuplicato(nuovo)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean esisteVotoInConflitto(Voto nuovo) {
		for (Voto v : this.voti) {
			if (v.isConflitto(nuovo)) {
				return true;
			}
		}
		return false;
	}
	/**metodo di factory
	 * 
	 * @param Libretto migliorato
	 * @return Libretto
	 */
	public Libretto librettoMigliorato() {
		Libretto migliore = new Libretto();
		migliore.voti= new ArrayList<>();
		for (Voto v : this.voti ) {
			migliore.voti.add(v.clone());
		//copyconstructo migliore.voti.add(new Voto(v)	
		}
		for (Voto v : migliore.voti) {
			v.setPunti(v.getPunti()+2);
		}
		return migliore;
	}
	
	public void cancellaVotiInferiori(int punti) {
		for (Voto v : this.voti) {
			if (v.getPunti() < punti){
				this.voti.remove(v);
			}
		}
	}

}
