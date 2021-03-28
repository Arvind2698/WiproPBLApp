package LogicBuilding.LC4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] arg){
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        Scanner sc= new Scanner(System.in);
        String input=sc.next();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(map.containsKey(ch)){
                int value=map.get(ch)+1;
                map.replace(ch, value);
            }else{
                map.put(ch, 1);
            }
        }

        Iterator itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry mapElement=(Map.Entry)itr.next();
            System.out.println(mapElement.getKey()+" - "+mapElement.getValue());
        }


        sc.close();
    }
}
