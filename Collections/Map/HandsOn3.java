package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOn3 {
    public static void main(String[] arg){


        Properties p=new Properties();

        p.addItem("Tamil nadu", "chennai");
        p.addItem("Karnataka", "Banglore");
        p.addItem("WB", "Kolkata");
        p.addItem("Andhra Pradesh", "Hyd");

        p.traverseMap();
    }
}

class Properties{
    HashMap<String,String> map=new HashMap();

    public void addItem(String state,String capital){
        map.put(state,capital);
    }
    public void traverseMap(){
        Iterator itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            String valueFromMap=(String)entrySet.getValue();
            System.out.println(entrySet.getKey()+"==>"+entrySet.getValue());
        }
    }
}
