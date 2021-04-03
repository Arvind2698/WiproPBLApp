package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HandsOn1 {
    public static void main(String[] arg){
        HashSet<String> saveCountryName=new HashSet<>();

        addCountry("India", saveCountryName);
        addCountry("China", saveCountryName);
        addCountry("Germany", saveCountryName);
        addCountry("USA", saveCountryName);
        addCountry("Italy", saveCountryName);

        getCountries(saveCountryName);
    }
    public static boolean addCountry(String country,HashSet<String> saveCountryName){
        try{
            saveCountryName.add(country);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static void getCountries(HashSet<String> saveCountryName){
        Iterator<String> itr=saveCountryName.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
