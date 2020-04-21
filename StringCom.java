package basic_java_prog;

public class StringCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1="HYDERABAD";
		String Str2="HYDERABAD";
				System.out.println(Str1.equals(Str2));
				
				String Str3="HYDeRABaD";
				String Str4="HYDERABAD";
				System.out.println(Str3.equalsIgnoreCase(Str4));
				String Str5="HYDERABAD";
				String Str6="HYdERaBAD";
				System.out.println(Str1.compareToIgnoreCase(Str5));
				System.out.println(Str1.compareTo(Str6));
				
				String Patt="[A-Z]{1,}";	
				System.out.println(Str1.matches(Patt));
	}
	}

