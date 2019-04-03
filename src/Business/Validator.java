package Business;
import java.util.regex.Pattern;

public class Validator {

	public static void validID(int id)throws ValidatorExeption{

		if(id < 1000 || id > 9999) {
			       throw new ValidatorExeption("Please enter a 4 digit number");
		 }
	}

	public static void validName(String string) throws ValidatorExeption{
		if(!(Pattern.matches("^[A-Za-z]+$", string))){throw new ValidatorExeption("Please enter only alphabet letter");}
	}

	public static void validPrice(Double num)throws ValidatorExeption{
		if(num < 0){
			     throw new ValidatorExeption("Please enter a positive number");  }		
	 }	


	public static void validDay(int num)throws ValidatorExeption {		
		if (num < 1 || num > 31){throw new ValidatorExeption("Please enter a number between 1 and 31");}
	}
	
	public static void validYear(int num)throws ValidatorExeption {		
		if (num < 0 || num > 2020){throw new ValidatorExeption("Please enter a number between 0 and 2020");}
	}
	
	public static void validMonth(int num)throws ValidatorExeption {		
		if (num < 1 || num > 12){throw new ValidatorExeption("Please enter a number between 1 and 12");}
	}
}

