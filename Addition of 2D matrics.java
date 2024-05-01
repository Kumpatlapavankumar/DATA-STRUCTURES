import java.util.*;
public class sumoftwomatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
//hello 
        int n=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(m==p && n==q){
        int[][] arr1=new int[m][n];
        int[][] arr2=new int[p][q];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){   
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++){    
            for(int j=0;j<p;j++){    
            c[i][j]=arr1[i][j]+arr2[i][j];   
            System.out.print(c[i][j]+" ");    
            }    
            System.out.println();
            } 
        }else{
            System.out.println("not possible");
        }
    }
}
