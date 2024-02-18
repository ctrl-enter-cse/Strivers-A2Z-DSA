

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {

	public static void main(String[] args) {
		int nums[] = { -1, 0, 1, 2, -1, -1 };

		int size = nums.length;
		Arrays.sort(nums);
		Set<List<Integer>> st = new HashSet<>();
		for (int i = 0; i < size - 1; i++) {
			if (i > 0 && nums[i] == nums[i + 1]) {
				continue;
			}
			int j = i + 1;
			int k = size - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					List<Integer> ar = new ArrayList();
					ar.add(nums[i]);
					ar.add(nums[j]);
					ar.add(nums[k]);
					st.add(ar);
					j++;
					k--;
					while (nums[j] == nums[j + 1])
						j++;
					while (nums[k] == nums[k - 1])
						k--;
				}
			}

		}
		
		for(List<Integer>  i: st) {
			System.out.println(i);
		}
	}

}
