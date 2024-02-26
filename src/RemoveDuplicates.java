import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List <Integer> number= Arrays.asList(1,2,3,4,5,2,4,5,6,7,8);
		
		
		System.out.println(number);
		Collections.sort(number);
		System.out.println(number);
		 int pt=0;
		for(int i=1;i< number.size();i++) {
			if(number.get(i)==number.get(i-1)) {
				continue;
			}
			else {
				pt++;
				number.set(pt, number.get(i));
//				System.out.print(number.get(i));
			}
		}
		for( int i=0;i<=pt;i++) {
			System.out.print(number.get(i)+" ");
		}
	}

}
