package Business;

public class Date {
	
	private int day;
	private int year;
	private int month;
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) throws ValidatorExeption {
		Validator.validDay(day);
		this.day = day;
	}
	public int getYear() {
		
		return year;
	}
	public void setYear(int year) throws ValidatorExeption {
		Validator.validYear(year);
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(int month) throws ValidatorExeption {
		Validator.validMonth(month);
		this.month = month;
	}
	public Date() {
		super();
	}
	public Date(int day, int year, int month) {
		super();
		this.day = day;
		this.year = year;
		this.month = month;
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", year=" + year + ", month=" + month + "]";
	}
	

}
