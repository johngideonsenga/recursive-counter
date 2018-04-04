public class Counter{
	public static int A[] = {9,-8,12,18,-13,7,9,2,-5,23,12,-11,16,5,20,4,6,-20,13}; //array sample
	public static int count = 0;
	
	public static void main(String Args[]){
		int n = A.length-1;
		System.out.print("No. of integers greater than "+A[0]+": "+ counter(n));
	}
	
	public static int counter(int n){
		if(n==1) return count;
		if (A[0] < A[n]) count++;
		return counter(n-1);
	}
}