
public class TheDistance {

	public static double getDistance(double xOne,double xTwo,double yOne,double yTwo, double distance){
		distance = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
		return distance;
		
	}
}
