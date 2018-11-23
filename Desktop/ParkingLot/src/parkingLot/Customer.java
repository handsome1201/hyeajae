package parkingLot;

import java.util.ArrayList;

public class Customer {
	protected String name;
	protected int carType;
	protected String carNum;
	
	private static ArrayList<String> carNumList = new ArrayList<String>();

	public Customer(String name, int carType, String carNum) {
		this.name = name;
		this.carType = carType;
		this.carNum = carNum;
	}

	public String getName() {
		return name;
	}

	public int getCarType() {
		return carType;
	}

	public String getCarNum() {
		return carNum;
	}
	
	public static void addCarNum(String carNum) {
		carNumList.add(carNum);
	}

	public static boolean checkCarNum(String carNum) {
		boolean FLAG = false;
		if (carNum.length() == 6) {
			if (carNum.charAt(0) >= 48 && carNum.charAt(0) <= 57 && carNum.charAt(1) >= 48 && carNum.charAt(1) <= 57
					&& carNum.charAt(2) >= 48 && carNum.charAt(2) <= 57 && carNum.charAt(3) >= 65
					&& carNum.charAt(3) <= 90 && carNum.charAt(4) >= 65 && carNum.charAt(4) <= 90
					&& carNum.charAt(5) >= 65 && carNum.charAt(5) <= 90) {
				FLAG = true;
				for(String s : carNumList) {
					FLAG = FLAG && (s!=carNum);
				}
			} else
				FLAG = false;
		}
		return FLAG;
	}
}
