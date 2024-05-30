//target sum
import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        boolean target=sc.nextInt();
        int found=false;
        for(int num:arr){
            int reverse=target-num;
            if(set.contains(reverse)){
                System.out.print("pair with given sum"+target+"("+num+","+reverse+")");
                found=true;
            }
        }
        if(!found){
                System.out.println("pair with given sum is not found");
        }
    }
}
