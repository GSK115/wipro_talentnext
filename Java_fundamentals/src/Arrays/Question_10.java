package Arrays;
import java.util.*;
public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
