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

	@Override
	public String toString() {
		return "Voto [nomeCorso=" + nomeCorso + ", punti=" + punti + ", dataEsame=" + dataEsame + "]";
	}
	
	

	
		

}
