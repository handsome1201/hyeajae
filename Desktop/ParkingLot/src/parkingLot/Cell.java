package parkingLot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cell {
	private Customer customer;
	private long inputTime = 0;
	private long outputTime = 0;
	private static int numOfCell;
	private int cellNum;

	public Cell(String name, int carType, String carNum) {
		customer = new Customer(name, carType, carNum);
		cellNum = numOfCell;
		numOfCell++;
		inputTime = System.currentTimeMillis();
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public int getCellNum() {
		return cellNum;
	}

	public long getInputTime() {
		return inputTime;
	}

	public String getInputTimeOfString() {
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss");
		return dayTime.format(new Date(inputTime));
	}

	public void setOutputTime() {
		outputTime = System.currentTimeMillis();
	}

	public long getOutputTime() {
		if(outputTime!=0) {
			return outputTime;
		} else {
			return 0;
		}
	}

	public String getOutputTimeOfString() {
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss");
		if(outputTime!=0) {
			return dayTime.format(new Date(outputTime));
		} else {
			return null;
		}
	}

	public long getDurationSec() {
		if(outputTime!=0) {
			return (outputTime - inputTime) / 1000;
		} else {
			return 0;
		}
	}

	public int getFee() {
		// ����� : ���� 500��, 30�д� 500�� �߰�
		if(outputTime!=0) {
			return 500 + (int) getDurationSec() / (60 * 30) * 500;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		if(getFee()!=0) {
			return "���� : " + customer.getName() + "\n���� : " + customer.getCarType() + "��\n����ȣ : " + customer.getCarNum() + "\n�����ð� : "
				+ getInputTimeOfString() + "\n�����ð� : " + getOutputTimeOfString()+"\n������� : "+getFee();
		} else {
			return "���� : " + customer.getName() + "\n���� : " + customer.getCarType() + "��\n����ȣ : " + customer.getCarNum() + "\n�����ð� : "
					+ getInputTimeOfString() + "\n�����ð� : " + getOutputTimeOfString()+"\n������� ������������";
		}
	}
}