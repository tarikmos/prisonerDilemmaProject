package prisonier;

import java.util.Scanner; // import de 

public class OldSimpleTournament {
	



public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // variable de type scanner se qui permet de lire ce que nous tappons au clavier
	       
	int numStrategie = 0; // variable pour le choix de la stratégie
	String nomStrategie = new String("adel");  
	
	String nomPrisonnier1 = new String("adel1"); 
	String nomPrisonnier2 = new String("adel2"); 
	int tour=0;
	

 Prisonnier p1 = new Prisonnier();
 p1.setNomPrisonnier(nomPrisonnier1); 	
 
	
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
		
		
		// partie en plus pour prisonniers 
		
		System.out.println("entrez le nom du 1er prisonnier ");
		nomPrisonnier1 = sc.nextLine();
		Prisonnier sam= new Prisonnier(nomPrisonnier1);
		
		System.out.println("entrez le nom du 2eme prisonnier ");
		nomPrisonnier2 = sc.nextLine();		
		Prisonnier Louis = new Prisonnier(nomPrisonnier2); 
		/////// defenir le nombre de tours 
		
		System.out.println("ecombien de tours ? ");
		tour = sc.nextInt();
		////// partie du jeu 
		
		for (int i=0;i<tour;i++)
		{
					
			
		}
		
		/////////////// tout juste :p 
		// payoff
		double payoff;
		
}

}
