package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOn2 {
    public static void main(String[] arg){
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        
        System.out.println(checkKeyExists(1,map));

        System.out.println(checkValueExists(map,"D"));

        getMapContent(map);


    }
    public static boolean checkKeyExists(int key,HashMap<Integer,String> map){
        return map.containsKey(key);
    }

    public static Integer checkValueExists(HashMap<Integer,String> map,String value){
        Iterator itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            String valueFromMap=(String)entrySet.getValue();
            if(valueFromMap.equals(value)){
                return (Integer)entrySet.getKey();
            }
        }

        return -1;
    }
    public static void getMapContent(HashMap<Integer,String> map){

        Iterator itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            System.out.println(entrySet.getValue()+"==>"+entrySet.getKey());
        }

    }
}
