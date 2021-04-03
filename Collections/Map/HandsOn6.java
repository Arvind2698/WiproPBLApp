package Collections.Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HandsOn6 {
    public static void main(String[] arg){
        Hashtable<String,String> saveCountryCapital=new Hashtable<>();

        addCountry("India","Delhi", saveCountryCapital);
        addCountry("China","Beijing", saveCountryCapital);
        addCountry("Germany","Berlin", saveCountryCapital);
        addCountry("USA","DC", saveCountryCapital);
        addCountry("Italy","Milan", saveCountryCapital);

        System.out.println(saveCountryCapital);

        System.out.println(getCapital(saveCountryCapital, "USA"));

        System.out.println(getCountry(saveCountryCapital, "Delhi"));

        System.out.println(getReverse(saveCountryCapital));

        System.out.println(getCountryNames(saveCountryCapital));



        // getCountries();
    }
    public static boolean addCountry(String country,String capital,Hashtable<String,String> saveCountryCapital){
        try{
            saveCountryCapital.put(country,capital);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static String getCapital(Hashtable<String,String> saveCountryCapital,String country){
        if(saveCountryCapital.containsKey(country)){
            return (String)saveCountryCapital.get(country);
        }else{
            return "No such country found";
        }
    }
    public static String getCountry(Hashtable<String,String> saveCountryCapital,String capital){
        Iterator itr=saveCountryCapital.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            String country=(String)entrySet.getValue();
            if(country.equals(capital)){
                return (String)entrySet.getKey();
            }
        }

        return "No country found";
    }
    public static Hashtable<String,String> getReverse(Hashtable<String,String> saveCountryCapital){

        Hashtable<String,String> saveCountryCapitalReverse=new Hashtable<>();
        Iterator itr=saveCountryCapital.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            saveCountryCapitalReverse.put((String)entrySet.getValue(),(String)entrySet.getKey());
        }

        return saveCountryCapitalReverse;
    }
    public static ArrayList<String> getCountryNames(Hashtable<String,String> saveCountryCapital){

        ArrayList<String> list=new ArrayList<>();

        Iterator itr=saveCountryCapital.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            list.add((String) entrySet.getKey());
        }

        return list;
    }
}
