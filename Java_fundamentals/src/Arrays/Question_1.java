package Arrays;
import java.util.*;
public class Question_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int a=sc.nextInt();
		int sum=0;
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			sum+=arr[i];
		}
		int avg=sum/a;
		System.out.println("sum of the elements in the array : "+sum);
		System.out.println("Average of the elements in the array : "+avg);
		sc.close();
	}

}
