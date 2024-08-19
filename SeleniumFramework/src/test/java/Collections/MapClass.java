package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        Map<String,Double> productsInHashMap = new HashMap<>();
        productsInHashMap.put("Chocolate",10.00);
        productsInHashMap.put("Lays",5.00);
        productsInHashMap.put("Biscuits",20.00);
        productsInHashMap.put("Lollipop",2.00);

        System.out.println("Products in Hashmap");
        for (String product:productsInHashMap.keySet()) {
            System.out.println(product+"- $"+productsInHashMap.get(product));
        }

        Map<String,Double> productsInLinkedHashmap = new LinkedHashMap<>();
        productsInLinkedHashmap.put("Chocolate",10.00);
        productsInLinkedHashmap.put("Lays",5.00);
        productsInLinkedHashmap.put("Biscuits",20.00);
        productsInLinkedHashmap.put("Lollipop",2.00);

        System.out.println("Products in Linked Hashmap");
        for (String product:productsInLinkedHashmap.keySet()) {
            System.out.println(product+"- $"+productsInLinkedHashmap.get(product));
        }

        Map<String,Double> productsInTreemap = new TreeMap<>();
        productsInTreemap.put("Chocolate",10.00);
        productsInTreemap.put("Lays",5.00);
        productsInTreemap.put("Biscuits",20.00);
        productsInTreemap.put("Lollipop",2.00);
        System.out.println("Products in Treemap");
        for (String product:productsInTreemap.keySet()) {
            System.out.println(product+"- $"+productsInTreemap.get(product));
        }
        productsInTreemap.getOrDefault("milk",30.00);

    }
}
