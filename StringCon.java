package basic_java_prog;

public class StringCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1="just";
        String Str2="must";
        
        String Str3= Str1 + Str2 ;
        System.out.println(Str3);
        String Str4=Str1.concat(Str2);
        System.out.println(Str4);
        int num1=100;
        System.out.println(Str3 + num1);
        System.out.println(Str3.length());
        String Str5="    just is a good guy     ";
        System.out.println(Str5.trim());
        String Str6="    JUST IS kiddinG     ";
        System.out.println(Str6.toLowerCase());
        System.out.println(Str6.toUpperCase());
        System.out.println(Str6.isEmpty());
        
	}

}
