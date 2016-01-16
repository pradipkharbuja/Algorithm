package mum.pradip;

public class Question05 {

	private static int[] list; 
	
	public static int fibonacci(int n){
		 if(n < 0){
			 return -1;
		 }
		 if(n == 0|| n ==1){
			 return 1;
		 }
		 
		 list = new int[n + 1];
		 list[0]= 0;
		 list[1] = 1;
		 
		 return recursiveFibonacci(n);
	}
	
	public static int recursiveFibonacci(int n){		
		if(list[n-1] == 0) {
			list[n-1] = recursiveFibonacci(n-1);
		}
		list[n] = list[n-1] + list[n-2];
		return list[n];
	}
	
	public static void main(String[] args){
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(6));
		System.out.println(fibonacci(8));
	}
	
}

