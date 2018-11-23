package main;

import parkingLot.Manager;
import parkingLot.ParkingLot;

public class Main {
	public static void main(String args[]) {
		ParkingLot myPL = new ParkingLot();
		Manager myManager = new Manager(myPL, "hellocse");
		while(true) {
			TextUI.mainUI(myPL);
			int botton = TextUI.getTask();
			if (botton==1) {
				myPL.parkCar();
			} else if (botton==2) {
				myPL.outCar();
			} else if (botton==3) {
				myManager.task();
			} else if (botton==4) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
