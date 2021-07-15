package test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class telephone {
    public static void main(String[] args) {
       TreeMap<String, Integer> good2count = new TreeMap<>();
       good2count.put("Semen",+7);


        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            String goodName = scanner.nextLine();
            if (good2count.containsKey(goodName) || good2count.containsValue(Integer.parseInt(goodName))){
                System.out.println(good2count);
            }

            if (goodName.equals("LIST")) {
                printMap(good2count);
                continue;

            }
            int count = 1;
            if (good2count.containsKey(goodName)) {

                count = good2count.get(goodName) + 1;
            } else {

            }
            good2count.put(goodName, count);
        }

    }

    private static void printMap(Map<String, Integer> map) {

        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

    }
}
