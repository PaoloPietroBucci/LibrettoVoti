package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto lib = new Libretto();
		
		lib.add(new Voto("Analisi I", 29, LocalDate.of(2021, 2, 15)));
		lib.add(new Voto("Analisi II", 21, LocalDate.of(2022, 6, 10)));
		lib.add(new Voto("Informatica", 25, LocalDate.of(2022, 3, 11)));
		
		lib.stampa();
		
		lib.stampaPerVoto(25);
		Voto v=lib.stampaPerNome("Analisi I");
		System.out.println(v);
		v= lib.stampaPerNome("Analisi 2");
		System.out.println(v);
		
		Voto a1bis= new Voto("Analisi I" , 29, LocalDate.of(2021, 3, 17));
		Voto a1ter= new Voto("Analisi I" , 30, LocalDate.of(2021, 3, 17));
		
		System.out.println(a1bis + "è duplicato"+" "+ lib.esisteVoto(a1bis));
		System.out.println(a1ter + "è duplicato"+" " +
		lib.esisteVoto(a1ter));
	}

}
