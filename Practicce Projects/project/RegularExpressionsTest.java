package RegularExpressions;
import java.util.regex.Pattern;
public class RegularExpressionsTest {
	    public static void main(String[] args) {
	        String[] arrayOfStrings = {
	        		"apple", 
	        		"banana",
	        		"cherry", 
	        		"date",
	        		"fig", 
	        		"grape"};
	        String stringToSearch = "Date";

	        Pattern io = Pattern.compile(stringToSearch, Pattern.CASE_INSENSITIVE);
	        for (String string : arrayOfStrings) {
	            if (io.matcher(string).find()) {
	                System.out.println("The string \"" + string + "\" matches the search pattern.");
	            }
	        }
	    }
	}
