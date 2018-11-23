package main;

import java.util.Scanner;

import parkingLot.Cell;
import parkingLot.ParkingLot;

public class TextUI {
	static Scanner sc = new Scanner(System.in);
	
	public static int getTask() {
		String task;
		while(true) {
			System.out.print("행동을 입력하세요 >> ");
			task = sc.next();
			if (task.length()==1 && task.charAt(0)>=49 && task.charAt(0)<=57)
				break;
			else
				System.out.println("잘못된 입력입니다!\n");
		}
		return Integer.parseInt(task);
	}
	public static void mainUI(ParkingLot parkingLot) {
		char[][] marker = new char[8][5];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 4 && parkingLot.getField_1()[i][j] instanceof Cell)
					marker[i][j] = 'v';
				else if (i > 3 && i < 8 && parkingLot.getField_2()[i - 4][j] instanceof Cell)
					marker[i][j] = 'v';
				else
					marker[i][j] = ' ';
			}
		}
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println("   [A][B] [C][D] [E][F] [G][H]  ");
		System.out.printf("[1][%c][%c] [%c][%c] [%c][%c] [%c][%c]\n", marker[0][0], marker[1][0], marker[2][0],
				marker[3][0], marker[4][0], marker[5][0], marker[6][0], marker[7][0]);
		System.out.printf("[2][%c][%c] [%c][%c] [%c][%c] [%c][%c]\n", marker[0][1], marker[1][1], marker[2][1],
				marker[3][1], marker[4][1], marker[5][1], marker[6][1], marker[7][1]);
		System.out.printf("[3][%c][%c] [%c][%c] [%c][%c] [%c][%c]\n", marker[0][2], marker[1][2], marker[2][2],
				marker[3][2], marker[4][2], marker[5][2], marker[6][2], marker[7][2]);
		System.out.printf("[4][%c][%c] [%c][%c] [%c][%c] [%c][%c]\n", marker[0][3], marker[1][3], marker[2][3],
				marker[3][3], marker[4][3], marker[5][3], marker[6][3], marker[7][3]);
		System.out.printf("[5][%c][%c] [%c][%c] [%c][%c] [%c][%c]\n", marker[0][4], marker[1][4], marker[2][4],
				marker[3][4], marker[4][4], marker[5][4], marker[6][4], marker[7][4]);
		System.out.println("------------------------------------");
		System.out.println("||||  1. 주차하기			||||");
		System.out.println("||||  2. 출차하기			||||");
		System.out.println("||||  3. 관리자모드			||||");
		System.out.println("||||  4. 종료			||||");
		System.out.println("------------------------------------");
		System.out.println("");
	}

	public static void managerUI() {
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println("||||  1. 주차 로그확인하기	||||");
		System.out.println("||||  2. 이전으로 돌아가기	||||");
		System.out.println("------------------------------------");
		System.out.println("");
	}
}