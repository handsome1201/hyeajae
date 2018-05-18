package play;

public class hw10_2 {

	public static void main(String[] args) {

		Car mycar = new Car("red");

		System.out.println("myCar의 색:" + mycar.getColor());
		System.out.println("차의 최대 속력: " + Car.getMaxSpeed() + "km/h");

		System.out.print("첫번째 speedUp(100.0km/h): ");
		if (mycar.speedUp(100.0))
			System.out.println("속도 변경  가능 , 현재차의 속력: " + mycar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경  불가능 , 현재차의 속력: " + mycar.getSpeed() + "km/h");

		System.out.print("두번째 speedUp(90.0km/h): ");
		if (mycar.speedUp(90.0))
			System.out.println("속도 변경  가능 , 현재차의 속력: " + mycar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경  불가능 , 현재차의 속력: " + mycar.getSpeed() + "km/h");

		Car yourcar = new Car("blue");

		System.out.println("\nyourCar의 색:" + yourcar.getColor());
		System.out.println("차의 최대 속력: " + Car.getMaxSpeed() + "km/h");

		System.out.print("첫번째 speedUp(-100.0km/h): ");
		if (yourcar.speedUp(-100.0))
			System.out.println("속도 변경  가능 , 현재차의 속력: " + yourcar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경  불가능 , 현재차의 속력: " + yourcar.getSpeed() + "km/h");

		System.out.print("두번째 speedUp(210.0km/h): ");
		if (yourcar.speedUp(210.0))
			System.out.println("속도 변경  가능 , 현재차의 속력: " + yourcar.getSpeed() + "km/h");
		else
			System.out.println("속도 변경  불가능 , 현재차의 속력: " + yourcar.getSpeed() + "km/h");

	}

}
