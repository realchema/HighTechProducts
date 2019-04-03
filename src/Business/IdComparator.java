package Business;

import java.util.Comparator;

public class IdComparator implements Comparator<Product>{
	
	public int compare(Product e1, Product e2)
	{
		if ( e1.getId().compareTo(e2.getId()) <  0 )
				return -1 ;
		     if ( e1.getId().compareTo(e2.getId()) >  0 )
		           return +1;		     
		  return 0;	
	}	

}


