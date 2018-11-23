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
		
		System.out.print("��ȣ�� Ȯ���մϴ�. ��ȣ�� �Է����ּ��� >> ");
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
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
		}
		else {
			System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�. ����ȭ������ �̵��մϴ�.");
		}
	}
}
