
import java.util.Scanner;
public class TestFan {
	public static void main(String[] args){
		
		boolean fanStatus;
		int speed;
		double radius;
		String color;
		
		Fan f = new Fan();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Fan Speed:");
		speed = input.nextInt();
		
		System.out.println("Enter Fan Radius");
		radius = input.nextDouble();
		
		System.out.println("Enter Fan Status(Type True to turn on, False to turn off)");
		fanStatus = input.nextBoolean();
	
		System.out.println("Enter Fan Color");
		color = input.next();
		
		f.setColor(color);
		f.setSpeed(speed);	
		f.setRadius(radius);
		f.setStatus(fanStatus);
		
		System.out.println(f.toString());
		
	}

}
