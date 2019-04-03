package Presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import Business.Book;
import Business.CD;
import Business.Date;


public class Test2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		System.out.println("\n Hi... We are Creating two books ...\n");
		Book b1 = new Book(1111, "Book1", 100.50 , new Date(02,2010, 06), 1523586 , new CD(151522, 30));
		
		Book b2 = new Book( "Book2", 66.25 , new Date(12,2005, 10),2553586);
		
		System.out.println("\n ... We are Creating the table books ...\n");
		
		b1.createTable();
		
		System.out.println("\n ... We are adding the books to the table ...\n");
		
		b1.add(b1); b2.add(b2); 
		
		System.out.println("\n ...The book with the id 1111 in the table is ...\n");
		b1.search(1111);
		
		System.out.println("\n ...All the books in the table are ...\n");
		HashMap<Integer, Book> list = b1.getList();

        for(Book b : list.values()) 
        {
        	System.out.println(  "\nBook ID: " + b.getId() + 
        			"\n" + "Book Name: " + b.getName()+ 
        			"\n" + "Book Price: " + b.getPrice().toString()+ 
        			"\n" + "Book MadeDate: " + b.getMadeDate().getDay() +"-"+ b.getMadeDate().getYear() +"-"+ b.getMadeDate().getMonth() +
        			"\n" + "Book ISBN: " + b.getIsbn() + 
        			"\n" + "Book CD: " + " SerialNumber: " +b.getCd().getSerialNumber() + "- Capacity : " +b.getCd().getCapacity()
        	);
        }
	}

}
