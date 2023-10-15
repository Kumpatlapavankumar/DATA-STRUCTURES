import java.util.*;
public class ContiguousIntegers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        boolean found=false;
        for(int num:arr){
            set.add(num);
        }
        int current=arr[0];
        int count=0;
        while(set.contains(current)==true){
                count++;
                current--;
        }
        current=arr[0]+1;
        while(set.contains(current)==true){
            count++;
            current++;
        }
        if(count==n){
            System.out.println("true");
        }else{
            System.out.println("Flase");
        }
    }
}
