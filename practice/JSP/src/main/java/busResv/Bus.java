package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;//get and set methods
	public int getBusNo() {//accessors
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {//mutator
		this.ac = ac;
	}
	public int getCapacity() {//accessor method
		return capacity;
	}
	public void setCapacity(int capacity) { //mutator
		this.capacity = capacity;
	}
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public void displayBusInfo() {
		System.out.println("Bus No:" + busNo + "Ac:" + ac + "Total Capacity:" + capacity);
	}
}
