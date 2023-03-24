package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto {
	
	private String nomeCorso;
	private int punti;
	private LocalDate dataEsame;
	
	public Voto(String nomeCorso, int punti, LocalDate dataEsame) {
		this.nomeCorso = nomeCorso;
		this.punti = punti;
		this.dataEsame = dataEsame;
	}
	
	//CopyConstructor (crea una copia di v)
	public Voto(Voto v) {
		this.nomeCorso = v.nomeCorso;
		this.punti = v.punti;
		this.dataEsame = v.dataEsame;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	public LocalDate getDataEsame() {
		return dataEsame;
	}
	public void setDataEsame(LocalDate dataEsame) {
		this.dataEsame = dataEsame;
	}
	
	public boolean isDuplicato(Voto altro) {
		return this.getNomeCorso().equals(altro.getNomeCorso()) && this.getPunti()== altro.getPunti();
		
	}
	
	public boolean isConflitto(Voto altro) {
		return this.getNomeCorso().equals(altro.getNomeCorso()) && this.getPunti()!= altro.getPunti();
		
	}
	
	public Voto clone() {
		return new Voto(this.nomeCorso,this.getPunti(),this.getDataEsame());
	}


	@Override
	public String toString() {
		return "Voto [nomeCorso=" + nomeCorso + ", punti=" + punti + ", dataEsame=" + dataEsame + "]";
	}

	
	

	
		

}
