package prisonier;

import java.util.Scanner; // import de 

public class SimpleTournament {
	



public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	
	String nomPrisonnier1 = new String("adel1"); 
	String nomPrisonnier2 = new String("adel2"); 
	int tour=0;
	
	// variable de type scanner se qui permet de lire ce que nous tappons au clavier
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 = new Scanner(System.in);
	
		
		
		// partie en plus pour prisonniers 
		
		System.out.println("entrez le nom du 1er prisonnier ");
		nomPrisonnier1 = sc1.nextLine();
		Prisonnier sam= new Prisonnier(nomPrisonnier1);
		
		System.out.println("entrez le nom du 2eme prisonnier ");
		nomPrisonnier2 = sc2.nextLine();		
		Prisonnier Louis = new Prisonnier(nomPrisonnier2); 
		/////// defenir le nombre de tours 
		
		System.out.println("ecombien de tours ? ");
		tour = sc3.nextInt();
		////// partie du jeu 
	/*	
		for (int i=0;i<tour;i++)
		{
			
			
			
		}
		
		/////////////// tout juste :p 
		// payoff
		double payoff;
		
		if(p1)
		*/
	}

}
