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
		// 요금제 : 최초 500원, 30분당 500원 추가
		if(outputTime!=0) {
			return 500 + (int) getDurationSec() / (60 * 30) * 500;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		if(getFee()!=0) {
			return "고객명 : " + customer.getName() + "\n차종 : " + customer.getCarType() + "종\n차번호 : " + customer.getCarNum() + "\n주차시각 : "
				+ getInputTimeOfString() + "\n출차시각 : " + getOutputTimeOfString()+"\n주차요금 : "+getFee();
		} else {
			return "고객명 : " + customer.getName() + "\n차종 : " + customer.getCarType() + "종\n차번호 : " + customer.getCarNum() + "\n주차시각 : "
					+ getInputTimeOfString() + "\n출차시각 : " + getOutputTimeOfString()+"\n주차요금 산정되지않음";
		}
	}
}