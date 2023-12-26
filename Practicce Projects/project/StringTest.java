package Strings;

public class StringTest {
	    public static void main(String[] args) {
	        // Testing String
	        String str = "hey";
	        str += "guys";
	        System.out.println("String: " + str);

	        // Testing StringBuffer
	        StringBuffer stringBuffer = new StringBuffer("hey");
	        stringBuffer.append(" guys");
	        System.out.println("StringBuffer: " + stringBuffer);

	        // Testing StringBuilder
	        StringBuilder stringBuilder = new StringBuilder("hey");
	        stringBuilder.append(" guys");
	        System.out.println("StringBuilder: " + stringBuilder);
	    }
	}

