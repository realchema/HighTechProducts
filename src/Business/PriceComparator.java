package Business;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{
	
		public int compare(Product e1, Product e2)
		{
			if ( e1.getPrice().compareTo(e2.getPrice()) <  0 )
					return -1 ;
			     if ( e1.getPrice().compareTo(e2.getPrice()) >  0 )
			           return +1;		     
			  return 0;	
		}	

}


