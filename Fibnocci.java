package basic_java_prog;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num1 = 0;
		     int num2 = 1;
		     int num3 = 0;
		     System.out.println(num1);
		     System.out.println(num2);
		     for (int i=0;i<20;i++) {
		     num3 = num1 + num2;
		     System.out.println(num3);
		     num1 = num2;
		     num2 = num3;

	}
	}

}