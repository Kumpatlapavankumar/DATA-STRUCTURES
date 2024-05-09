import java.util.*;
class arrayofcontigues{
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
        int current=arr[0];
        int count=0;
        while(set.contains(current)){
            current--;
            count++;
        }
//edit the code
        current=arr[0]+1;
        while(set.contains(current)){
            current++;
            count++;
        }
        if(count==n){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}
