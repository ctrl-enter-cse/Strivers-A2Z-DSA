package knowBasicMaths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PrintAllDivisors {

	public static void main(String[] args) {
		int num = 36;

		checkprintDivisor(num);

	}

	private static void checkprintDivisor(int num) {
		
		List <Integer> n= new ArrayList();
		for( int i = 1;i<= Math.sqrt(num);i++) {
			if(num %i ==0) {
//				System.out.print(i+",");
				n.add(i);
				if(num/i != i) {
					n.add(num/i);
//					System.out.print(num/i+"," );
				}
			}	
//			System.out.println();
		}
		Collections.sort(n,Collections.reverseOrder());
//		ListIterator<Integer> rev=n.listIterator(n.size());
//		
//		while(rev.hasPrevious()) {
//			System.out.println(rev.previous());
//		}
				
		
		System.out.println(n);
	}

}
