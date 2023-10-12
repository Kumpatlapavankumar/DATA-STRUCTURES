import  java.util.*;
public class ContiguousIntegers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int maxlenth=0;
        int start=0;
        for(int num:arr){
            int current=0;
            while (set.contains(num+current)){
                current++;
            }
            if(current>maxlenth){
                maxlenth=current;
                start=num;
            }
        }
        System.out.println("longest contigues sub array:");
        for(int i=start;i<maxlenth;i++){
            System.out.println(i+" ");
        }
    }
}
