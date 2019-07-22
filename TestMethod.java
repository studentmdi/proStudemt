
public class TestMethod {

	public static void main(String[] args) {
	
		MyMethods Test1 =new MyMethods();
		
		 Test1.print_text("the value was " , 223);
		int aval1 = Test1.total();
		
		System.out.println("Method result = "+aval1);
		
		int aVal2 = Test1.total(30);
		System.out.println("Method result2 = "+aVal2);
	   

	}



}
