package parkingLot;

import java.util.ArrayList;
import java.util.Scanner;

enum RowType {	// ������ ���� �ڷ��� Ÿ��.
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
		System.out.println("\n������ �����մϴ�.\n");
		System.out.print("������ �Է��ϼ��� >> ");
		name = sc.next().toLowerCase();
		do {
			System.out.print("������ �Է��ϼ��� (1 �Ǵ� 2 �Է�) >> ");
			String carTypeS = sc.next();
			FLAG = !(carTypeS.equals("1") || carTypeS.equals("2"));
			if (FLAG)
				System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
			else
				carType = Integer.parseInt(carTypeS);
		} while(FLAG);
		
		do {
			System.out.print("�� ��ȣ�� �Է��ϼ��� (���ڼ���+���ĺ����� ����. ex->352KRX) >> ");
			carNum = sc.next().toUpperCase();
			FLAG = !Customer.checkCarNum(carNum);
			if (FLAG) {
				System.out.println("����ȣ �Է��� �߸��Ǿ����ϴ�.");
			}
		} while(FLAG);
		
		if(carType == 1) {
			System.out.println("1�� ���� �������� ������ �� �ֽ��ϴ�. (A~D��)");
		} else if (carType == 2) {
			System.out.println("1��, 2�� ���� ������ ���� �� �� �ֽ��ϴ�. (A~H��)");
		}
		
		do {
			do {
				System.out.print("���� �� ���� �Է��ϼ��� >> ");
				rowS = sc.next().toUpperCase();
				if (rowS.length()==1) {
					if (carType==1 && rowS.charAt(0)>=65 && rowS.charAt(0)<=68)
						FLAG = false;
					else if (carType==2 && rowS.charAt(0)>=65 && rowS.charAt(0)<=72)
						FLAG = false;
					else {
						System.out.println("���� �� ���� �Է��� �߸��Ǿ����ϴ�.");
						FLAG = true;
					}
				} else {
					System.out.println("���� �� ���� �Է��� �߸��Ǿ����ϴ�.");
					FLAG = true;
				}
			} while(FLAG);
			row = RowType.valueOf(rowS).ordinal();
			
			do {
				System.out.print("���� �� ���� �Է��ϼ��� (1~5��)>> ");
				String colS = sc.next();
				FLAG = !(colS.equals("1")||colS.equals("2")||colS.equals("3")||colS.equals("4")||colS.equals("5"));
				if (FLAG) {
					System.out.println("���� �� ���� �Է��� �߸��Ǿ����ϴ�.");
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
					System.out.println(rowS+"�� "+col+"�࿡ �����Ǿ����ϴ�.");
					FLAG = false;
				} else {
					System.out.println("�̹� ������ �����Դϴ�!");
					System.out.println("���� �� ��, �� �Է��� �ٽ��մϴ� \n");
					FLAG = true;
				}
			} else if(!(field_2[row-4][col-1] instanceof Cell)) {
				field_2[row-4][col-1] = new Cell(name, carType, carNum);
				log.add(field_2[row-4][col-1]);
				System.out.println(rowS+"�� "+col+"�࿡ �����Ǿ����ϴ�.");
				FLAG = false;
			} else {
				System.out.println("�̹� ������ �����Դϴ�!");
				System.out.println("���� �� ��, �� �Է��� �ٽ��մϴ� \n");
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
			System.out.print("���� �Է��ϼ��� (A~H��) >> ");
			rowS = sc.next().toUpperCase();
			if (rowS.length()==1) {
				if (rowS.charAt(0)>=65 && rowS.charAt(0)<=68)
					FLAG = false;
				else if (rowS.charAt(0)>=65 && rowS.charAt(0)<=72)
					FLAG = false;
				else {
					System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
					FLAG = true;
				}
			} else {
				System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
				FLAG = true;
			}
		} while(FLAG);
		row = RowType.valueOf(rowS).ordinal();
		
		do {
			System.out.print("���� �Է��ϼ��� (1~5��)>> ");
			colS = sc.next();
			FLAG = !(colS.equals("1")||colS.equals("2")||colS.equals("3")||colS.equals("4")||colS.equals("5"));
			if (FLAG) {
				System.out.println("���� �� ���� �Է��� �߸��Ǿ����ϴ�.");
				FLAG = true;
			} else {
				col = Integer.parseInt(colS);
				FLAG = false;
			}
		} while(FLAG);

		System.out.print("������� �̸��� �Է��ϼ��� (������ �Է��� �̸�) >> ");
		name = sc.next();		

		if(row <=3) {
			if(field_1[row][col-1] instanceof Cell) {
				if(!name.equals(field_1[row][col-1].getCustomer().getName().toLowerCase())) {
					System.out.println("�ùٸ� ����ڰ� �ƴմϴ�!\n");
				} else {
					field_1[row][col-1].setOutputTime();
					field_1[row][col-1] = null;
					System.out.println(rowS+"�� "+col+"���� ���� �����Ǿ����ϴ�.\n");
				}
			} else {
				System.out.println("�ش� ������ ���� �����ϴ�!\n");
			}
		} else if (field_2[row-4][col-1] instanceof Cell) {
			if(name.equals(field_2[row-4][col-1].getCustomer().getName().toLowerCase())) {
				System.out.println("�ùٸ� ����ڰ� �ƴմϴ�!\n");
			} else {
				field_2[row-4][col-1].setOutputTime();
				field_2[row-4][col-1] = null;
				System.out.println(rowS+"�� "+col+"���� ���� �����Ǿ����ϴ�.\n");
			}
		} else {
			System.out.println("�ش� ������ ���� �����ϴ�!\n");
		}
	}
	String readLog() {
		String cells = "------------------------------------------------\n";
		for(int i=0;i<log.size();i++)
			cells += log.get(i).toString()+"\n\n";
		cells += "\n\n------------------------------------------------";
		if (log.size()==0)
			cells = "\n����� �αװ� �����ϴ�.";
		return cells;
	}
}
