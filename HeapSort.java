import java.util.*;
public class heapsort{
    public static void heapy(int[] arr){
        int n=arr.length;
        buildmax(arr);
        for(int i=n-1;i>=0;i--){
            int swap=arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            maxheapy(arr,0,i);
        }
    }
    public static void buildmax(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            maxheapy(arr,i,n);
        }
    }
//heapsorting
    public static void maxheapy(int[] arr,int i,int n){
        int largest=i;
        //left formula 
        int left=2*i+1;
        //right formula 
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            maxheapy(arr, largest, n);
        }
    }
    public static void printarr(int[] arr){
        for(int value:arr){
            System.out.print(value+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={12,32,1,4,7,90,23,66,87,11,22,33,44,55};
        System.out.println("Before sorting :");
        printarr(arr);
        heapy(arr);
        System.out.println("After sorting");
        printarr(arr);
    }
}
