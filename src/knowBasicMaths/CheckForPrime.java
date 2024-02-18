package knowBasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckForPrime {

	public static void main(String[] args) {

		List arr = new ArrayList();
		arr.add(23);

		// to check the modifinable method which will not allow to change the list
		Collections.unmodifiableList(arr);

		for (Object i : arr) {
//			System.out.println(i);
		}

		int number =21 ;
		boolean flag = checkforprime(number);

		System.out.println(flag == true ? "prime " : "non prime");
	}

	private static boolean checkforprime(int number) {

		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;	
	}

}
