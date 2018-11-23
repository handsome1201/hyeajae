package parkingLot;

import java.util.Scanner;

import main.TextUI;

public class Manager {
	private ParkingLot parkingLot;
	private String pw;
	
	public Manager(ParkingLot parkingLot, String pw) {
		this.parkingLot = parkingLot;
		this.pw = pw.toLowerCase();
	}
	
	private boolean checkPw(String pw) {
		if(pw.toLowerCase().equals(this.pw))
			return true;
		else
			return false;
	}
	
	public void task() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("암호를 확인합니다. 암호를 입력해주세요 >> ");
		String pw = sc.next();
		if(checkPw(pw)) {
			while(true) {
				TextUI.managerUI();
				int botton = TextUI.getTask();
				if (botton==1) {
					System.out.println(parkingLot.readLog());
				} else if (botton==2) {
					break;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}
		}
		else {
			System.out.println("암호가 틀렸습니다. 시작화면으로 이동합니다.");
		}
	}
}
