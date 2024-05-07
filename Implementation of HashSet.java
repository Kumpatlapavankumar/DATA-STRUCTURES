import java.util.*;  
class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
//IRemoving or else
import java.util.*;  
public class Hashtable2 {  
   public static void main(String args[]) {  
  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
     map.put(100,"Amit");    
     map.put(102,"Ravi");   
     map.put(101,"Vijay");    
     map.put(103,"Rahul");    
     System.out.println("Before remove: "+ map);    
       // Remove value for key 102  
       map.remove(102);  
       System.out.println("After remove: "+ map);  
   }      
}  
