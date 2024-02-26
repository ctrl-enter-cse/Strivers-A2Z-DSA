package SolveProblemsonArrays.Easy;
import java.util.*;
class A {}
class B extends A {}

public class CheckIfTheArrayIsSorted {
  public static void main(String[] args) {
    List<A> listA = new ArrayList<A>();
    List<B> listB = new ArrayList<B>();
    System.out.println(listA.getClass() == listB.getClass());
  }
}

//public class CheckIfTheArrayIsSorted {
//
//	public static void main(String[] args) {
//
//		int[] arr1 = {3,4,5,1,2};
////			{ 1, 2, 2, 3, 3, 4};
//		int[] arr2 = { 1, 2, 1, 3, 4 };
//		Boolean flag;
//		flag = checkSortedApproch1(arr1);
//		System.out.println("checkSortedApproch1: arr1:" + flag);
//		System.out.println();
//		flag = checkSortedApproch1(arr2);
//		System.out.println("checkSortedApproch1: arr2:"+ flag);
//	}
//
//	private static Boolean checkSortedApproch1(int[] arr1) {
//
//		for (int i = 1; i < arr1.length; i++) {
//			if (!(arr1[i] >= arr1[i - 1])) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//}
//checkSortedApproch1: arr1:true
//
//checkSortedApproch1: arr2:false