import java.util.HashMap;

public class Hashmap_Example{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("India", "Delhi");
        capitalCities.put("USA", "Washington D.C");

        System.out.println(capitalCities);

        //access an element
        System.out.println("Accessing element: "+capitalCities.get("India"));

        //Remove an element
        capitalCities.remove("France");
        System.out.println(capitalCities);

        //Size of Hashmap
        System.out.println("Size of Hashmap: "+capitalCities.size());

        //For loop for printing keys
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        //For loop for printing keys
        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        //remove all elements
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
    