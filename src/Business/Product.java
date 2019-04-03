package Business;

public abstract class Product implements IObjectStateDisplayable{

	private Integer id;
	private String name;
	private Double price;
	private Date madeDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) throws ValidatorExeption {
		Validator.validID(id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws ValidatorExeption {
		Validator.validName(name);
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) throws ValidatorExeption {
		Validator.validPrice(price);
		this.price = price;
	}
	public Date getMadeDate() {
		return madeDate;
	}
	public void setMadeDate(Date madeDate) {
		this.madeDate = madeDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product( String name, Double price, Date madeDate) {
		super();
		this.id = Sequence.getIndex();
		this.name = name;
		this.price = price;
		this.madeDate = madeDate;
	}
	public Product( Integer id, String name, Double price, Date madeDate) {
		super();
		this.id =  id;
		this.name = name;
		this.price = price;
		this.madeDate = madeDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", madeDate=" + madeDate + "]";
	}
	
	
	

}
