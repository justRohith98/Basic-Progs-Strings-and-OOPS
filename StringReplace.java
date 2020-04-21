package basic_java_prog;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1="1234f you are a bady guy karma w1234ll k1234ll you ";
	      String Str2="1234";
	      String Str3="i";
	      System.out.println(Str1.replace(Str2,Str3));
	      
	      String Str4="C#$LA%^&SSFY YO%^&*()_UR S!#$ELF";
	      String patt="[^A-Za-z0-9\\s]";
	      System.out.println(Str4.replaceAll(patt,""));
	}

}
