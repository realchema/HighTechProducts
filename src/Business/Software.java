package Business;

import java.util.Vector;

public class Software extends Product{

	private Integer versionNumber;
	private Vector<CD> listCD;
	
	
	public Integer getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}
	public Vector<CD> getListCD() {
		return listCD;
	}
	public void setListCD(Vector<CD> listCD) {
		this.listCD = listCD;
	}
	
	public Software() {
		super();

	}
	public Software( String name, Double price, Date madeDate, Integer versionNumber, Vector<CD> listCD) {
		super( name, price, madeDate);
		
		this.versionNumber = versionNumber;
		this.listCD = listCD;
	}
	public Software( Integer id , String name, Double price, Date madeDate, Integer versionNumber, Vector<CD> listCD) {
		super(id,  name, price, madeDate);
		
		this.versionNumber = versionNumber;
		this.listCD = listCD;
	}
	@Override
	public String toString() {
		return "Software [versionNumber=" + versionNumber + ", listCD=" + listCD + ", Product()=" + super.toString()
				+ "]";
	}
	@Override
	public String GetDisplayObjectsState(String separator) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
