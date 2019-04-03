package Data;

import java.sql.Statement;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Business.Book;
import Business.CD;
import Business.Date;

public final class BookDB {
	public static Exception createTable(Connection currentConnection)
	{

		Statement currentStatement = null;
		String sqlString = "create table book (id number, name varchar(20), price DECIMAL, "
				+ "day number, year number, month number, isbn number, serialNumber number, capacity number)" ;
		try{
			currentStatement  = currentConnection.createStatement();
			currentStatement.execute(sqlString);
			
			currentConnection.commit();
			currentConnection.close();
			return null;		
			
		} catch (Exception ex)
		{
			
		return ex;	
		
		}	
	}	

    public static int add(Book current){

			int success = -1;
				try {
					Connection myConnection = ConnectionDB.getConnection();
					
					Statement myStatement = myConnection.createStatement();
								
					String sqlString = "insert into book  values (" +
							current.getId()+  "," + "\'" + current.getName() +"\'" +
							current.getPrice() +  "," + current.getMadeDate().getDay() +  "," + 
							current.getMadeDate().getYear()+  "," + current.getMadeDate().getMonth() + "," + 
							current.getIsbn() +  "," + current.getCd().getSerialNumber() +  "," + current.getCd().getCapacity() 
							+")" ;	
					
					success = myStatement.executeUpdate(sqlString);	
					
					myConnection.commit();
					myConnection.close();
					
				} catch (Exception exc) {
					exc.printStackTrace();
				}				
				return success;
			}	

    
    public static Book search(int code)
    {
      try {
    		Connection myConnection = ConnectionDB.getConnection();
    		Statement cmd = myConnection.createStatement();
    		String myStatement = "SELECT * FROM book WHERE ID = " + code + " ;";
    		
    		ResultSet myResultSet = cmd.executeQuery(myStatement);

            if(myResultSet.next()){
            	
            	Book b =new Book(myResultSet.getInt("id"), myResultSet.getString("name") , myResultSet.getDouble("price"),
            			new Date(myResultSet.getInt("day"),myResultSet.getInt("year") ,myResultSet.getInt("month")),
            			myResultSet.getInt("isbn"), new CD(myResultSet.getInt("serialNumber"),myResultSet.getInt("capacity")));

                return b;		
    		   }	
    		  else 	return null;			
    					
    	  } catch (SQLException ex) {
    		// TODO: handle exception
    		  return null;
    	}
    }

	public static  HashMap<Integer, Book>  getList(){
		
		HashMap<Integer, Book>  myList = new  HashMap<Integer, Book>();
		try {
		  		Connection myConnection = ConnectionDB.getConnection();
		  		 String query = "select * from book";
		 		 Statement myStatement;
		 	     ResultSet resultSet;		 	    
		 	        myStatement = myConnection.createStatement();
		 	        resultSet  =  myStatement.executeQuery(query);
					
		 	        while(resultSet.next()) 
		 	        {
		 	               String id = resultSet.getString(1);
		 	               String name = resultSet.getString(2);
		 	               String price = resultSet.getString(3);
		 	               int day = Integer.parseInt(resultSet.getString(4));
		 	               int year = Integer.parseInt(resultSet.getString(5));
		 	               int month = Integer.parseInt(resultSet.getString(6));
		 	               String isbn = resultSet.getString(7);
		 	               String serialNumber = resultSet.getString(8);
		 	               String capacity = resultSet.getString(9);
		 	               
		 	              Book b =new Book(Integer.parseInt(id), name, Double.parseDouble(price), new Date(day,year,month),
		 	            		 Integer.parseInt( isbn), new CD(Integer.parseInt(serialNumber),Integer.parseInt(capacity)));
	
		 	              myList.put(b.getId(), b);
		 	        }
					myConnection.close();	
		 	        }
		 	       catch(SQLException e)
		 	        {
		 	           System.out.println(e.toString());
		 	        }
				return myList;
			}
}
