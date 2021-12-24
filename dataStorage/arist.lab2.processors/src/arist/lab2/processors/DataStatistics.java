package arist.lab2.processors;

import java.util.ArrayList;
import java.util.TreeMap;

public class DataStatistics {

    public static TreeMap<String, Integer> collect(ArrayList<String> data){
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (String line: data) {
            String[] parts = line.split("\\(");
            String key = parts[0];
            Integer value = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
            if (map.containsKey(key))
            {
                map.replace(key, map.get(key) + value);
            }
            else
            {
                map.put(key, value);
            }
        }
        return map;
    }
}

