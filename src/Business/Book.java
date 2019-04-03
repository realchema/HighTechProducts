package Business;

import java.sql.SQLException;
import java.util.HashMap;

import Data.BookDB;
import Data.ConnectionDB;

public class Book extends Product{
	
	private Integer isbn;
	private CD cd;
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		
		this.isbn = isbn;
	}
	public CD getCd() {
		return cd;
	}
	public void setCd(CD cd) {
		this.cd = cd;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id,  String name, Double price, Date madeDate, Integer isbn, CD cd) {
		super(id,  name, price, madeDate);
		this.isbn = isbn;
		this.cd = cd;
	}
	public Book( String name, Double price, Date madeDate, Integer isbn, CD cd) {
		super( name, price, madeDate);
		this.isbn = isbn;
		this.cd = cd;
	}

	public Book(  String name, Double price, Date madeDate, Integer isbn) {
		super(name, price, madeDate);
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", cd=" + cd + ", Product()=" + super.toString() + "]";
	}
	@Override
	public String GetDisplayObjectsState(String separator) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int add(Book current)
	{
		return BookDB.add(current);
		
	}
	public Book search(int code)
	{
		return BookDB.search(code);
	}
	public HashMap<Integer, Book>  getList()
	{
		return BookDB.getList();
		
	}
	
	public Exception createTable() throws SQLException
	{
		return BookDB.createTable(ConnectionDB.getConnection());
	}
	
}
