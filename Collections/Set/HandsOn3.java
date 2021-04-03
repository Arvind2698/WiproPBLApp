package Collections.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class Compare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub

        String input1=o1;
        String input2=o2;

        if( input1.compareTo(input2) > 0 ){
            return -1;
        }else if( input1.compareTo(input2) < 0 ){
            return 1;
        }else{
            return 0;
        }

    }

}

public class HandsOn3 {
    public static void main(String[] arg){
        TreeSet<String> treeSet1=new TreeSet<>();

        treeSet1.add("JAN");
        treeSet1.add("FEB");
        treeSet1.add("MAR");
        treeSet1.add("APR");
        treeSet1.add("MAY");
        treeSet1.add("JUN");
        treeSet1.add("JUL");
        treeSet1.add("AUG");
        treeSet1.add("SEP");
        treeSet1.add("OCT");
        treeSet1.add("NOV");
        treeSet1.add("DEC");

        System.out.println(treeSet1);

        TreeSet<String> treeSet2=new TreeSet<>(new Compare());

        Iterator<String> itr=treeSet1.iterator();
        while(itr.hasNext()){
            treeSet2.add(itr.next());
        }

        System.out.println(treeSet2);
        //The tree set by default sorts the its contents in the natural sorting order, hence to provide custom
        // sorting logic we use Comparator class
    }
}
