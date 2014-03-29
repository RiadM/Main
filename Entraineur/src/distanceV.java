import java.util.Random;
import java.math.*;

public class distanceV{


//set-up 
public int high;
public int low;
public int nomba;

public distanceV(){
	low = 0 ;
	high = 0;
}
public distanceV(int newHigh, int newLow){
low  = newLow ;
high = newHigh;
}

//setting the highest value
public void setHigh(int newHigh)
{
	high = newHigh;
}

//setting the lowest value
public void setLow(int newLow)
{
	low = newLow ;
}

//getting the highest value
public int getLow()
{
	return low;
}
	
//getting the lowest value
public int getHigh(){
	return high;
}


public int getdistanceV(int low, int high){
		nomba =  ((int)(Math.random()*(high - low) +1 ) + low) * 50 ;
		return nomba ;
}
}
	

