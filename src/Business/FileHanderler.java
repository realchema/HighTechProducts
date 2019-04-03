package Business;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public final class FileHanderler {
	


		@SuppressWarnings("resource")
		public static void writeToFile(Vector <Product> listProducts) throws IOException
		{
			FileOutputStream outFile = new FileOutputStream("src/Data/stock.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(outFile);		
			outStream.writeObject(listProducts);			
		}	
	

		@SuppressWarnings({ "unchecked", "resource" })
		public static Vector <Product> readFromFile() throws IOException, ClassNotFoundException
		{
			Vector <Product> listProductsFile = new Vector<>();
			FileInputStream inFile = new FileInputStream("src/Data/stock.ser");
			ObjectInputStream inStream = new ObjectInputStream(inFile);
			listProductsFile = (Vector <Product>)inStream.readObject() ;
			return listProductsFile ;
		}	
}
