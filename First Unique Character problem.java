import java.util.*;
class firstuniquecharacter{
    public static void main(String[] args) {
        String sc="pavan";
        Character uniquecharacter=null;
        Map<Character,Integer> h=new LinkedHashMap();
        for(Character ch:sc.toCharArray()){
            if(!h.containsKey(ch)){
                h.put(ch,1);
            }else{
                h.put(ch,h.get(ch)+1);
            }
        }
        for(Character ch:sc.toCharArray()){
            if(h.get(ch)==1){
                uniquecharacter=ch;
                break;
            }
        }
        if(uniquecharacter==null){
            System.out.println("no unique characters");
        }else{
            System.out.println(uniquecharacter);
        }
    }
}
//first unique character is --->p
