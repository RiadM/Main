import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main_loop {

	public static void main(String[] args) 
	{
		//Set up le Scanner
		Scanner input = new Scanner(System.in);
		
		//set-up l'instance distance
		distanceV distanceD = new distanceV();
		
		//Set up les variables
		int choix = 0;
		int distanceDemander = 0;
		List repartition = new ArrayList() ;
		
		
		
		// Contrôle des choix
		System.out.println("");
		System.out.println("1 - Sprint        ");
		System.out.println("2 - Mid/Sprint	  ");
		System.out.println("3 - Long Distance ");
		System.out.println("************************************");
		
		//demande du choix à l'utilisateur
		System.out.print("Quels entrainement : ");
		choix = input.nextInt() ;
		
		System.out.println("");
		//Demande de la distance 
		System.out.println("Distance Voulu (0 pour random)");
		distanceDemander = input.nextInt() ;
		
		//Loop principale du programme
		switch(choix)
		{
		case(1): //Donne une distance entre 2000 et 4000 par shot de 50m
			System.out.println(distanceDemander = distanceD.getdistanceV(40,80));
		
			break;
			
		case(2): //Donne une distance entre 4000 et 6000 par shot de 50m
			System.out.println(distanceDemander = distanceD.getdistanceV();	
			
			break;
			
		case(3): //Donne une distance entre 5500 et 8000 par shot de 50m
			System.out.println(distanceDemander = distanceD(120,160));
		
			break;
			
		default:
			System.out.println("Defaut");
			break;
			
		}
		
	
		//closing the scanner
		input.close();
	}

}
