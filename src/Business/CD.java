package Business;

public class CD {


	private Integer serialNumber;
	private Integer capacity;
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(Integer serialNumber, Integer capacity) {
		super();
		this.serialNumber = serialNumber;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "CD [serialNumber=" + serialNumber + ", capacity=" + capacity + "]";
	}
	
	
}
