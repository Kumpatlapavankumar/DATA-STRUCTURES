import java.util.*;
public class keysandlocks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] keys=new char[n];
        char[] locks=new char[n];
        for(int i=0;i<n;i++){
            keys[i]=sc.next(".").charAt(0);
        }
        sc.nextLine();
        for(int i=0;i<n;i++){
            locks[i]=sc.next(".").charAt(0);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(locks[i],i);
        }
        for(int i=0;i<n;i++){
            if(map.get(keys[i])!=null){
                locks[i]=keys[i];
            }else{
                System.out.println("not possible");
                return;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(keys[i]+","+locks[i]);
        }
    }
}
