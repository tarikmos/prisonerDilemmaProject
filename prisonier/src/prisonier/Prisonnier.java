package prisonier;

import java.util.Scanner;

public class Prisonnier {
	 private String name;
	
	private double gayoffs;
 
	 
	int numStrategie = 0; // variable pour le choix de la stratégie
	String nomStrategie = new String("adel");  
	
	//Default construct 
	public Prisonnier() {
 }
	
	//Constructor
	public Prisonnier(String pNom) {
		this.name=pNom;
		
		
		
		System.out.println("capture du prisonnier "+name+"!");
		
/////////////////////////////////////////////////		
///////////////////////////////////////////////// type de strategie qu'adopte le prisonnier 
		
		System.out.println("choisir le numero des deux stratégies a tester  "
				+ "\n 1- AlwaysCooperate  "
				+ "\n 2- NeverCooperate"
				+ "\n 3- aléatoire" );
		numStrategie = sc.nextInt(); // recuperation de la varibale (Int) 
		
		
		while (numStrategie<1 && numStrategie>4){
			
			// affichage tant qu'on entre pas le bon num de strategie
			System.out.println("choisir le numero des deux stratégies a tester  "
					+ "\n 1- AlwaysCooperate  "
					+ "\n 2- NeverCooperate"
					+ "\n 3- aléatoire" );
		}
		
		if (numStrategie==1)
			nomStrategie= "AlwaysCooperate";
			else if (numStrategie==2)
				nomStrategie= "NeverCooperate";
				else 
					nomStrategie= "aléatoire";
					
		
		System.out.println("vous avez choisi la strategie "+numStrategie + nomStrategie);
		
		
	}

	public String getNomPrisonnier() {
		return name;
	}

	public double getGain() {
		return payoffs;
	}

	public int getNumStrategie() {
		return numStrategie;
	}

	public String getNomStrategie() {
		return nomStrategie;
	}

	public void setNomPrisonnier(String nomPrisonnier) {
		this.nomPrisonnier = nomPrisonnier;
	}

	public void setGain(double gain) {
		this.gain = gain;
	}

	public void setNumStrategie(int numStrategie) {
		this.numStrategie = numStrategie;
	}

	public void setNomStrategie(String nomStrategie) {
		this.nomStrategie = nomStrategie;
	}

 
	
}
