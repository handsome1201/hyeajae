package play;

public class hw10_2 {

	public static void main(String[] args) {

		Car mycar = new Car("red");

		System.out.println("myCar�� ��:" + mycar.getColor());
		System.out.println("���� �ִ� �ӷ�: " + Car.getMaxSpeed() + "km/h");

		System.out.print("ù��° speedUp(100.0km/h): ");
		if (mycar.speedUp(100.0))
			System.out.println("�ӵ� ����  ���� , �������� �ӷ�: " + mycar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ����  �Ұ��� , �������� �ӷ�: " + mycar.getSpeed() + "km/h");

		System.out.print("�ι�° speedUp(90.0km/h): ");
		if (mycar.speedUp(90.0))
			System.out.println("�ӵ� ����  ���� , �������� �ӷ�: " + mycar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ����  �Ұ��� , �������� �ӷ�: " + mycar.getSpeed() + "km/h");

		Car yourcar = new Car("blue");

		System.out.println("\nyourCar�� ��:" + yourcar.getColor());
		System.out.println("���� �ִ� �ӷ�: " + Car.getMaxSpeed() + "km/h");

		System.out.print("ù��° speedUp(-100.0km/h): ");
		if (yourcar.speedUp(-100.0))
			System.out.println("�ӵ� ����  ���� , �������� �ӷ�: " + yourcar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ����  �Ұ��� , �������� �ӷ�: " + yourcar.getSpeed() + "km/h");

		System.out.print("�ι�° speedUp(210.0km/h): ");
		if (yourcar.speedUp(210.0))
			System.out.println("�ӵ� ����  ���� , �������� �ӷ�: " + yourcar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ� ����  �Ұ��� , �������� �ӷ�: " + yourcar.getSpeed() + "km/h");

	}

}
