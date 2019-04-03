package Business;

import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

public final class Stock {

	private static Vector <Product> listProducts = new Vector<Product>();
	
	
	public static Vector<Product> getListProducts() {
		return listProducts;
	}
	public static void setListProducts(Vector<Product> listProducts) {
		Stock.listProducts = listProducts;
	}
	
	
	public static boolean add(Product p) 
	{
		
		boolean success = false;
		Product found = search(p.getId()) ;
		
		if (found == null)
		{
			listProducts.add(p);
			
			success = true;
		}
		
		
		return success;
	}
	
	public static boolean remove(Integer key)
	{
		boolean success = false;
		Product found = search(key) ;
		
		if (found != null)
		{
			listProducts.remove(found);
			
			success = true;
		}
		
		
		return success;
	}
	
	public static Product search(Integer key)
	{
		Product found = null ;
		for(	int i = 0; i<= listProducts.size(); i++ ) {
			found = listProducts.get(i);
		}
		return found;
	}
	
	
	public static void sortPrice() 
	{
		Collections.sort(listProducts, new PriceComparator());
		
	}
	
	public static void sortId() 
	{
		Collections.sort(listProducts, new IdComparator());
		
	}
	
	public static void displayAll()
	{
		System.out.print("\n\tDisplay All");
		
		for(Product p : listProducts)
		{
			System.out.println("\n\t"+ p.toString() );			
		}
		
	}
	
	public static void toFile() throws IOException
	{
		
		FileHanderler.writeToFile(listProducts);
		
	}
	public static void fromFile() throws ClassNotFoundException, IOException
	{
		 Vector <Product> listProductsFromFile = FileHanderler.readFromFile();
		
		 System.out.print("\n\tDisplay All on file");
			
			for(Product p : listProductsFromFile)
			{
				System.out.println("\n\t"+ p.toString() );			
			}
	}
}
