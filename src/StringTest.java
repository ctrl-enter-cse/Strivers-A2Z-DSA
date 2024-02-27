
public class StringTest {

	public static void main(String[] args) {
		
		
		String str1= "prasanna";
		String str2 ="prasanna";
		String str3 = new String("prasanna");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		System.out.println("str1.equals(str2):"+str1.equals(str2));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		
		System.out.println("str1.compareTo(str3):"+str1.compareTo(str3));
		
		System.out.println("str1.compareTo(str2): "+str1.compareTo(str2));
		
		
		immutableClass str=  new immutableClass("munna");
		System.out.println(str.getstr());
		
		
		
	}

}
