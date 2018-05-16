package play;

class paly2 {
	private String Manufacturer;
	private String Model;
	private int MaxNumOfPassengers;

	private static int numOfPlanes = 0;

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String Manufacturer) {
		this.Manufacturer = Manufacturer;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String Model) {
		this.Model = Model;
	}

	public int getMaxNumOfPassengers() {
		return MaxNumOfPassengers;
	}

	public void setMaxNumOfPassenger(int MaxNumOfPassenger) {
		this.MaxNumOfPassengers = MaxNumOfPassenger;
	}

	public paly2(String Manufacturer, String Model, int MaxNumOfPassenger) {
		this.Manufacturer = Manufacturer;
		this.Model = Model;
		this.MaxNumOfPassengers = MaxNumOfPassenger;
		if (MaxNumOfPassengers < 0)
			MaxNumOfPassengers = (int) 0;
		numOfPlanes++;
	}

	public static int getNumOfPlanes() {
		return numOfPlanes;
	}

}

public class paly2_1 {

	public static void main(String[] args) {

		paly2 plane1 = new paly2("º¸À×", "º¸À× 747 ", 450);
		System.out.println("Á¦Á¶»ç: " + plane1.getManufacturer());
		System.out.println("¸ðµ¨¸í: " + plane1.getModel());
		System.out.println("ÃÖ´ë ½Â°´¼ö: " + plane1.getMaxNumOfPassengers() + "\n");

		paly2 plane2 = new paly2("º¸À×", "º¸À× 777 ", 500);
		System.out.println("Á¦Á¶»ç: " + plane2.getManufacturer());
		System.out.println("¸ðµ¨¸í: " + plane2.getModel());
		System.out.println("ÃÖ´ë ½Â°´¼ö: " + plane2.getMaxNumOfPassengers() + "\n");

		paly2 plane3 = new paly2("·ÏÇÏµå ¸¶¸°", "F-22", -10);
		System.out.println("Á¦Á¶»ç: " + plane3.getManufacturer());
		System.out.println("¸ðµ¨¸í: " + plane3.getModel());
		System.out.println("ÃÖ´ë ½Â°´¼ö: " + plane3.getMaxNumOfPassengers() + "\n");

		System.out.println("»ý»êµÈ ºñÇà¼öÀÇ ¼ö: " + paly2.getNumOfPlanes());

	}
}
