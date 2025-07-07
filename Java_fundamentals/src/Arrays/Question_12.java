package Arrays;
import java.util.*;
public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		int mid1=arr1[n1/2];
		int mid2=arr2[n2/2];
		int[] arr3= {mid1,mid2};
		System.out.println(Arrays.toString(arr3));
	}

}
