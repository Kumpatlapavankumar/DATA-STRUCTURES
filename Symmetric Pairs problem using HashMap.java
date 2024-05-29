//hashmapping
import java.util.Scanner;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++){
		    arr[i][0]=sc.nextInt();
		    arr[i][1]=sc.nextInt();
		}
		HashMap<Integer,Integer> hash=new HashMap<>();
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
		    //HashMap<Integer,Integer> hash=new HashMap<>();
		    int first1=arr[i][0];
		    int second1=arr[i][1];
		   Integer data=hash.get(second1);
		   if(data!=null && data==first1){
		       System.out.println(first1+" "+second1);
		        flag=true;
		   }else{
		       hash.put(first1,second1);
		   }
		}if(!flag){
		    System.out.println("No symmetric elements");
		}
	}
}
