import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter length of array : ");
	    int n = sc.nextInt();
	    long[] arr = new long[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextLong();
	    }
	    long  sum = 0;
	    for(long num : arr){
	        sum += num;
	    }
	    System.out.println("sum of number is : " + sum);
	    
	}
}
