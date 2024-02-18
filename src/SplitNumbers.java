import java.util.ArrayList;

public class SplitNumbers {

	public static void main(String[] args) {
		int[] nums = { 13, 25, 83, 77 };

		int[] result = separateDigits(nums);
		
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+", ");
		}
	}

	public static int[] separateDigits(int[] nums) {
		 ArrayList<Integer> arr= new ArrayList();
		 for(int i:nums) {
			 
			 while (i!=0) {
				 int rem=i%10;
				 	i/=10;
				 if(!arr.contains(rem)) {
					 arr.add(rem);
				 }
			 }
		 }
		 System.out.println(arr);
		 int [] result= new int[arr.size()];
		 int count=0;
// 		 for( int i :arr) {
// 			 result[count++]=i;
// 		 }
 		 
 		 for( int i=0;i<arr.size();i++) {
 			 result[i]=arr.get(i);
 		 }
		return result;
    }
} 