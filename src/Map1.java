import java.util.*;

public class Map1 {

    public static void main(String[] args) {

        Map<String,String> capitalCities = new HashMap<>();

        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        capitalCities.put("USA" , "New york");
        System.out.println(capitalCities);

        for(String i : capitalCities.values() )
        {
            // We cant retrieve with this way
            //System.out.println(capitalCities.get(i));


            System.out.println(i);
        }


        for(String key: capitalCities.keySet())
        {
            System.out.println("Key: " + key + " value: " + capitalCities.get(key));
        }

        HashMap<String,Integer> strINT = new HashMap<>();

        strINT.put("one",1);
        strINT.put("two",2);
        strINT.put("Three",3);
        System.out.println(strINT);

        List<String> citiesOfEngland = new ArrayList<>();
        String[] cities = {"Liverpool","London","Manchester"};

        HashMap<String, List<String>> mapOfEngland = new HashMap<>();

        citiesOfEngland.addAll(Arrays.asList(cities));

        mapOfEngland.put("England",citiesOfEngland);

        System.out.println(mapOfEngland);
    }

}
