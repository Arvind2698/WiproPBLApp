package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOn1 {
    public static void main(String[] arg){
        HashMap<String,String> saveCountryCapital=new HashMap<>();

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
    public static boolean addCountry(String country,String capital,HashMap<String,String> saveCountryCapital){
        try{
            saveCountryCapital.put(country,capital);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static String getCapital(HashMap<String,String> saveCountryCapital,String country){
        if(saveCountryCapital.containsKey(country)){
            return (String)saveCountryCapital.get(country);
        }else{
            return "No such country found";
        }
    }
    public static String getCountry(HashMap<String,String> saveCountryCapital,String capital){
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
    public static HashMap<String,String> getReverse(HashMap<String,String> saveCountryCapital){

        HashMap<String,String> saveCountryCapitalReverse=new HashMap<>();
        Iterator itr=saveCountryCapital.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            saveCountryCapitalReverse.put((String)entrySet.getValue(),(String)entrySet.getKey());
        }

        return saveCountryCapitalReverse;
    }
    public static ArrayList<String> getCountryNames(HashMap<String,String> saveCountryCapital){

        ArrayList<String> list=new ArrayList<>();

        Iterator itr=saveCountryCapital.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            list.add((String) entrySet.getKey());
        }

        return list;
    }
}
