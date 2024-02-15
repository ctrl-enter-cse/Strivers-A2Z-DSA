package knowBasicMaths;

public class EvenOdd {

	public static void main(String[] args) {
		int a = 15;
		
		// bitwise operater
       if((a&1)==1) {
        System.out.println("odd");
       }else {
    	   System.out.println("even");
       }

       
       
       // normal arithmatic operator
       if( a%2==0) {
    	   System.out.println("even");
       }else {
    	   System.out.println("odd");
       }
	}

}
