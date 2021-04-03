package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class HandsOn3 {
    public static void main(String[] arg){
        ArrayList<String> list=new ArrayList<>();
        list.add("JAN");
        list.add("FEB");
        list.add("MAR");
        list.add("APR");
        list.add("MAY");
        list.add("JUN");
        list.add("JUL");
        list.add("AUG");
        list.add("SEP");
        list.add("OCT");
        list.add("NOV");
        list.add("DEC");

        Iterator<String> itr=list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
