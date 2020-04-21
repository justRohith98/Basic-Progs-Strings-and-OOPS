package basic_java_prog;

public class StrinConver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		System.out.println(Integer.toString(num1));
		System.out.println(Integer.toBinaryString(num1));
			System.out.println(Integer.toHexString(num1));
			System.out.println(Integer.toOctalString(num1));
			
			String Str1="100";
			String Str2="101100";
			String Str3="64";
			String Str4="100";
			System.out.println(Integer.parseInt(Str1));
			System.out.println(Integer.parseInt(Str2,2));
			System.out.println(Integer.parseInt(Str3,16));
			System.out.println(Integer.parseInt(Str4,8));
	}

}
