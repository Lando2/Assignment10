
public class Fan {
	
	private int speed;
	private boolean fanStatus;
	private double radius;
	private String color;
	
// Constructor Method
	public void Fan(){
	}
// Mutator Methods
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setStatus(boolean fanStatus){
	
	
		this.fanStatus = fanStatus;
			 
		}
	
	public void setRadius(double radius){
		if(radius <= 5){
			this.radius = 5;
		}
		else
			this.radius = radius;
	}
	public void setColor(String color){
		this.color = color;
	}
	public int getSpeed(){
		return speed;
		}
	public double getRadius(){
		return radius;
	}
	public boolean getStatus(){
		return fanStatus;
	}
	public String getColor(){
		return color;
	}
	public String toString(){
		
		if(getStatus() == true){
	
	
		return "Fan Speed is "+ getSpeed() +"m/s\nFan Radius is "+ getRadius()+"m\nThe Fan is On \nFan Color is "+ getColor();
	
		}
		else 
			return "Fan Speed is "+ getSpeed() +"m/s\nFan Radius is "+ getRadius()+"m\nThe Fan is Off \nFan Color is "+ getColor();
			
	
}
}
