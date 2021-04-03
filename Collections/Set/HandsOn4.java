package Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;



public class HandsOn4 {
    public static void main(String[] arg){
        TreeSet<String> saveCountryName=new TreeSet<>();

        addCountry("India", saveCountryName);
        addCountry("China", saveCountryName);
        addCountry("Germany", saveCountryName);
        addCountry("USA", saveCountryName);
        addCountry("Italy", saveCountryName);

        System.out.println(saveCountryName);

        getCountries(saveCountryName);
    }
    public static boolean addCountry(String country,TreeSet<String> saveCountryName){
        try{
            saveCountryName.add(country);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static void getCountries(TreeSet<String> saveCountryName){
        Iterator<String> itr=saveCountryName.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
