package basic_java_prog;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1= "One Plus 8 with 120HZ";
		String Str2="120Hz";
		System.out.println(Str1.contains(Str2));
		System.out.println(Str1.startsWith("One"));
		System.out.println(Str1.endsWith("One"));
		System.out.println(Str1.indexOf("with"));
		System.out.println(Str1.lastIndexOf("with"));
	}

}
