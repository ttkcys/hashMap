package hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {
    
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        
        dictionary.put("Car", "Araba");
        dictionary.put("Computer", "Bilgisayar");
        dictionary.put("Book", "Kitap");
        dictionary.put("Table", "Masa");
        
        System.out.println(dictionary.size());
        
        System.out.println("---------------------");
        
        for (String item : dictionary.keySet()) {
            System.out.println("Key - " + item + "  Value - " + dictionary.get(item));
        }
        
        System.out.println("---------------------");
        
        System.out.println(dictionary);
        
        System.out.println("---------------------");
        
        System.out.println(dictionary.get("Table"));
        
        System.out.println("---------------------");
        
        dictionary.remove("Table");
        System.out.println(dictionary);
        
        System.out.println("---------------------");
        
        dictionary.clear();
        System.out.println(dictionary);
        
    }
    
}
