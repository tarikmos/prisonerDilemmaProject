package prisonier;

import java.util.Scanner;

public class Prisonnier {
	String nomPrisonnier;
	double gain;
	///
	Scanner sc = new Scanner(System.in);
	int numStrategie = 0; // variable pour le choix de la stratégie
	String nomStrategie = new String("adel");  
	
	//Constructeur par défaut d'un prisonnier
	public Prisonnier() {
		nomPrisonnier="inconnu";
		
		System.out.println("capture du prisonnier "+nomPrisonnier+"!");
		
	}
	
	//Constructeur par avec parammetres d'un prisonnier
	public Prisonnier(String pNom) {
		nomPrisonnier=pNom;
		
		System.out.println("capture du prisonnier "+nomPrisonnier+"!");
		
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

	
	
}
