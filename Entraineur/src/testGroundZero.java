

public class testGroundZero {

	public static void main(String[] args) 
	{
		int distanceTotal = distanceMatrix.distanceRandom(40, 80);
		
		//Montre la distance choisit pour l'entrainement
		//System.out.println(distanceTotal);
		
		//Distance du réchauffement
		int Rechauffement = 800;
		
		//Distance de l'entrainement - la distance du réchauffement
		int nombre = distanceTotal -Rechauffement ;
		
		//Partie 1 de l'entrainement
		int partie1 = (int) ( nombre * 0.3 ) ;
		partie1 += ( 50 - ( partie1 % 50 ) ) ;
		
		//Partie 2 de l'entrainement
		int partie2 = (int)( ( nombre - partie1 ) * 0.8 ) ;
		partie2 += (50 - ( partie2 % 50) ) ;
		
		int partie3 = distanceTotal - Rechauffement -partie1 -partie2;
		System.out.println("Distance total :  " + distanceTotal);
		System.out.println("Réchauffement  :   " + Rechauffement);
		System.out.println("Partie 1       :   " + partie1);
		System.out.println("Partie 2       :   " + partie2);
		System.out.println("Partie 3       :   " + partie3);
	}

}
