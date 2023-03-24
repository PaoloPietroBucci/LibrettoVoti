package it.polito.tdp.libretto.model;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Voto> {

	@Override
	public int compare(Voto v1, Voto v2) {

		return v1.getNomeCorso().compareTo(v2.getNomeCorso());
	}

}
