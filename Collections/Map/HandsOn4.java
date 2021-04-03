package Collections.Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOn4 {
    public static void main(String[] arg){
        HashMap<String,Integer> contactList=new HashMap<>();

        contactList.put("A",123445);
        contactList.put("B",234342);
        contactList.put("C",234455);
        contactList.put("D",564564);
        contactList.put("E",787653);

        System.out.println(checkKeyExists("A",contactList));

        System.out.println(checkValueExists(contactList,787653));

        getMapContent(contactList);

    }
    public static boolean checkKeyExists(String name,HashMap<String,Integer> map){
        return map.containsKey(name);
    }

    public static String checkValueExists(HashMap<String,Integer> map,int value){
        Iterator itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            int valueFromMap=(Integer)entrySet.getValue();
            if(valueFromMap==value){
                return (String)entrySet.getKey();
            }
        }

        return null;
    }

    public static void getMapContent(HashMap<String,Integer> map){

        Iterator itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            System.out.println(entrySet.getKey()+"==>"+entrySet.getValue());
        }

    }
}
