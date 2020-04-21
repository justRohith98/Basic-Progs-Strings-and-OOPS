package basic_java_prog;

public class StringSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1="ABCDEFGH";
		System.out.println(Str1.charAt(5));
		String temp="";
		
		for(int i=0;i<=Str1.length()-1;i++) {
			temp=Str1.charAt(i)+temp;
			
		}
			
		System.out.println(temp);
		System.out.println(Str1.substring(2, 6));
		System.out.println(Str1.substring(2));
	}

}
