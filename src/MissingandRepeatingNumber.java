
public class MissingandRepeatingNumber {

	public static void main(String[] args) {
		int arr[]= {4,3,6,2,1,1};
		
		int size=6;
		
	 int []result=checkAprooch1(arr,size);
	 for( int i:result) {
		 System.out.println(i);
	 }
	 
	 
	 int []result2=checkApproch2(arr,size); 
	 for( int i:result2) {
		 System.out.println(i);
	 }
	 
	 int []result3=checkApproch3(arr,size); 
	 for( int i:result3) {
		 System.out.println(i);
	 }
	}

	
	private static int[] checkApproch3(int[] arr, int size) {
	
		
		
		return null;
	}


	// time comple
	private static int[] checkApproch2(int[] arr, int size) {
		int n= arr.length;
		int hash[]= new int[n+1];
		
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		
		int repeating=-1, missing =-1;
		
		for( int i=1;i<n;i++){
			if(hash[i]==2) repeating=i;
			else if(hash[i]==0) missing=i;
			
			if(repeating!=-1 &&missing !=-1 ) {
				break;
			}
		}
		int result[]= {repeating,missing};
		return result;
	}

	
//	time complexity is O(n^2) and space is O(1)
	private static int[] checkAprooch1(int[] arr, int size) {
		int reapeating=-1;
		int missing=-1;
		
		for(int i=1;i<=size;i++) {
			int count=0;
			for(int j=0;j<size;j++) {
				if(arr[j]==i) {
					count++;
				}
			}
			if(count==2) {
				reapeating=i;
			} else if( count==0) {
				missing=i;
			}
		}
		int res[] = {reapeating,missing};
		return res;
	}

}
