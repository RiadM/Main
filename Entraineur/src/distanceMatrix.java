import java.math.*;

public class distanceMatrix{

/*@distanceRandom
 * Donne une distance entre le maximum et le minimum. Les distance ne peuvent	
 * être que des distances multiple de 50m.
*/
public static int distanceRandom(int low, int high)
{
	return ((int)(Math.random()*((high) - low) +1 ) + low ) *50;
}

public static int correctionPar50m(int distance){
	
	if(distance%50 )
	return ;
}

}


