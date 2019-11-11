package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	
	private Innlegg[] Innleggtabell;
	private int nesteledig;
	
	public Blogg() {
		Innleggtabell = new Innlegg[20];
		nesteledig = 0;
	
	}
	

	public Blogg(int lengde) {
		Innleggtabell = new Innlegg[lengde];
		nesteledig = 0;

	}

	public int getAntall() {
		return nesteledig;
		
	}
	
	public Innlegg[] getSamling() {
		return Innleggtabell;
		

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < nesteledig; i++) {
			if(Innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean finnes(Innlegg innlegg) {
		for(int i = 0; i < nesteledig; i++) {
			
			if(Innleggtabell[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ledigPlass() {
		if(nesteledig < Innleggtabell.length) {
			return true; 
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(finnes(innlegg)) {
			return false;
		}
		Innleggtabell[nesteledig] = innlegg;
		nesteledig++;
		return true;
	}
	public String toString() {
		
		String str = nesteledig + "\n";
		// Lager formaten på hvordan hver linje skal skrives ut
		
		for(int i = 0; i < nesteledig; i++) {
			str = str + Innleggtabell[i].toString();
			//Setter hjelpevariabelen lik seg selv pluss neste linje på formaten
		}
		return str;
	}
	//valgfrie oppgaver nedenfor
	
	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}