package play;

public class Car {
	private String color;
	private double speed;
	private static double maxspeed;
	private static double MaxSpeed = 125.0;
	private static double m,k ;

	public Car(String c) {
		color = c;
		speed = 0;
		maxspeed = mileToKillo(MaxSpeed);
	}

	public String getColor() {
		return color;
	}

	public double getSpeed() {
		return speed;
	}
	
	public static double getMaxSpeed() {
		return maxspeed;
	}

	public boolean speedUp(double speed) {
		if ((this.speed + speed) < 0 || (this.speed + speed) > maxspeed) {
			return false;
		} else {
			this.speed += speed;
			return true;
		}

	}
	
	public static double killoToMile(double distance) {
		m = distance/1.6;
		return m;
	}
	public static double mileToKillo(double distance) {
		k = distance*1.6;
		return k;
	}
}
