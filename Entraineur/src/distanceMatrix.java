import java.math.*;

public class distanceMatrix{

/*@distanceRandom
 * Donne une distance entre le maximum et le minimum. Les distance ne peuvent	
 * être que des distances multiple de 50m.
*/
public static int distanceRandom(int high, int low)
{
	return ((int)(Math.random()*(high - low) +1 ) + low) * 50 ;
}


}


