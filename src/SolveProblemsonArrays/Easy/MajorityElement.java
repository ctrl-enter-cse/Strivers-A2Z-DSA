package SolveProblemsonArrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
//			2=	6/3;
		int[] arr = { 33, 33, 11, 11, 33, 11 };
		List<Integer> ans = majorityElement(arr);
		System.out.print("The majority elements are: ");
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

		System.out.println();
		List<Integer> ans1 = majorityElement1(arr);
		System.out.print("The majority elements are: ");
		for (int i = 0; i < ans1.size(); i++) {
			System.out.print(ans1.get(i) + " ");
		}
	}

	private static List<Integer> majorityElement1(int[] arr) {
		Map<Integer, Integer> st = new HashMap();
		int n = Math.floorDiv(arr.length, 3);
		for (int i = 0; i < arr.length; i++) {
			if (!st.containsKey(arr[i])) {
				st.put(arr[i], 1);
			}
			st.put(arr[i], st.get(arr[i]) + 1);
		}

		List<Integer> er = new ArrayList<>();
		for (Integer i : st.keySet()) {
			if (st.get(i) > n) {
				er.add(i);
			}
		}
		return er;
	}

	private static List<Integer> majorityElement(int[] arr) {
		List<Integer> ls = new ArrayList();
		int n = Math.floorDiv(arr.length, 3);
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			if (ls.size() == 0 || ls.get(0) != arr[i]) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				if (count > n) {
					ls.add(arr[i]);
				}
			}

			if (ls.size() == 2)
				break;
		}
		return ls;
	}

}
