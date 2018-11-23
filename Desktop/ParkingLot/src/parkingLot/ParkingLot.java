package parkingLot;

import java.util.ArrayList;
import java.util.Scanner;

enum RowType {	// 주차장 행의 자료형 타입.
	A, B, C, D, E, F, G, H
}
public class ParkingLot {
	private Cell[][] field_1;
	private Cell[][] field_2;
	private static ArrayList<Cell> log;
	
	public ParkingLot() {
		field_1 = new Cell[4][5];
		field_2 = new Cell[4][5];
		log = new ArrayList<Cell>();
	}
	public Object[][] getField_1() {
		return field_1;
	}
	public Object[][] getField_2() {
		return field_2;
	}
	
	public void parkCar() {
		Scanner sc = new Scanner(System.in);
		boolean FLAG;
		
		int carType=0, row, col=0;
		String name, carNum, rowS;
		System.out.println("\n주차를 시작합니다.\n");
		System.out.print("성함을 입력하세요 >> ");
		name = sc.next().toLowerCase();
		do {
			System.out.print("차종을 입력하세요 (1 또는 2 입력) >> ");
			String carTypeS = sc.next();
			FLAG = !(carTypeS.equals("1") || carTypeS.equals("2"));
			if (FLAG)
				System.out.println("차종 입력이 잘못되었습니다.");
			else
				carType = Integer.parseInt(carTypeS);
		} while(FLAG);
		
		do {
			System.out.print("차 번호를 입력하세요 (숫자세개+알파벳세개 형식. ex->352KRX) >> ");
			carNum = sc.next().toUpperCase();
			FLAG = !Customer.checkCarNum(carNum);
			if (FLAG) {
				System.out.println("차번호 입력이 잘못되었습니다.");
			}
		} while(FLAG);
		
		if(carType == 1) {
			System.out.println("1종 주차 구간에만 주차할 수 있습니다. (A~D행)");
		} else if (carType == 2) {
			System.out.println("1종, 2종 주차 구간에 주차 할 수 있습니다. (A~H행)");
		}
		
		do {
			do {
				System.out.print("주차 할 행을 입력하세요 >> ");
				rowS = sc.next().toUpperCase();
				if (rowS.length()==1) {
					if (carType==1 && rowS.charAt(0)>=65 && rowS.charAt(0)<=68)
						FLAG = false;
					else if (carType==2 && rowS.charAt(0)>=65 && rowS.charAt(0)<=72)
						FLAG = false;
					else {
						System.out.println("주차 할 행의 입력이 잘못되었습니다.");
						FLAG = true;
					}
				} else {
					System.out.println("주차 할 행의 입력이 잘못되었습니다.");
					FLAG = true;
				}
			} while(FLAG);
			row = RowType.valueOf(rowS).ordinal();
			
			do {
				System.out.print("주차 할 열을 입력하세요 (1~5열)>> ");
				String colS = sc.next();
				FLAG = !(colS.equals("1")||colS.equals("2")||colS.equals("3")||colS.equals("4")||colS.equals("5"));
				if (FLAG) {
					System.out.println("주차 할 열의 입력이 잘못되었습니다.");
					FLAG = true;
				} else {
					col = Integer.parseInt(colS);
					FLAG = false;
				}
			} while(FLAG);
			
			if(row <=3) {
				if(!(field_1[row][col-1] instanceof Cell)) {
					field_1[row][col-1] = new Cell(name, carType, carNum);
					log.add(field_1[row][col-1]);
					System.out.println(rowS+"열 "+col+"행에 주차되었습니다.");
					FLAG = false;
				} else {
					System.out.println("이미 주차된 구역입니다!");
					System.out.println("주차 할 행, 열 입력을 다시합니다 \n");
					FLAG = true;
				}
			} else if(!(field_2[row-4][col-1] instanceof Cell)) {
				field_2[row-4][col-1] = new Cell(name, carType, carNum);
				log.add(field_2[row-4][col-1]);
				System.out.println(rowS+"열 "+col+"행에 주차되었습니다.");
				FLAG = false;
			} else {
				System.out.println("이미 주차된 구역입니다!");
				System.out.println("주차 할 행, 열 입력을 다시합니다 \n");
				FLAG = true;
			}
		} while(FLAG);
	}
	public void outCar() {
		Scanner sc = new Scanner(System.in);

		String rowS, colS, name;
		int row=0, col=0;
		boolean FLAG;
		
		do {
			System.out.print("행을 입력하세요 (A~H열) >> ");
			rowS = sc.next().toUpperCase();
			if (rowS.length()==1) {
				if (rowS.charAt(0)>=65 && rowS.charAt(0)<=68)
					FLAG = false;
				else if (rowS.charAt(0)>=65 && rowS.charAt(0)<=72)
					FLAG = false;
				else {
					System.out.println("행의 입력이 잘못되었습니다.");
					FLAG = true;
				}
			} else {
				System.out.println("행의 입력이 잘못되었습니다.");
				FLAG = true;
			}
		} while(FLAG);
		row = RowType.valueOf(rowS).ordinal();
		
		do {
			System.out.print("열을 입력하세요 (1~5열)>> ");
			colS = sc.next();
			FLAG = !(colS.equals("1")||colS.equals("2")||colS.equals("3")||colS.equals("4")||colS.equals("5"));
			if (FLAG) {
				System.out.println("주차 할 열의 입력이 잘못되었습니다.");
				FLAG = true;
			} else {
				col = Integer.parseInt(colS);
				FLAG = false;
			}
		} while(FLAG);

		System.out.print("사용자의 이름을 입력하세요 (주차시 입력한 이름) >> ");
		name = sc.next();		

		if(row <=3) {
			if(field_1[row][col-1] instanceof Cell) {
				if(!name.equals(field_1[row][col-1].getCustomer().getName().toLowerCase())) {
					System.out.println("올바른 사용자가 아닙니다!\n");
				} else {
					field_1[row][col-1].setOutputTime();
					field_1[row][col-1] = null;
					System.out.println(rowS+"열 "+col+"행의 차가 출차되었습니다.\n");
				}
			} else {
				System.out.println("해당 공간에 차가 없습니다!\n");
			}
		} else if (field_2[row-4][col-1] instanceof Cell) {
			if(name.equals(field_2[row-4][col-1].getCustomer().getName().toLowerCase())) {
				System.out.println("올바른 사용자가 아닙니다!\n");
			} else {
				field_2[row-4][col-1].setOutputTime();
				field_2[row-4][col-1] = null;
				System.out.println(rowS+"열 "+col+"행의 차가 출차되었습니다.\n");
			}
		} else {
			System.out.println("해당 공간에 차가 없습니다!\n");
		}
	}
	String readLog() {
		String cells = "------------------------------------------------\n";
		for(int i=0;i<log.size();i++)
			cells += log.get(i).toString()+"\n\n";
		cells += "\n\n------------------------------------------------";
		if (log.size()==0)
			cells = "\n저장된 로그가 없습니다.";
		return cells;
	}
}
