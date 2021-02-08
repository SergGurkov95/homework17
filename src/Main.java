import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> sourceMap = new TreeMap<>() {{
            put("one", "один");
            put("two", "два");
            put("three", "три");
            put("four", "четыре");
            put("five", "пять");
        }};

        for (Map.Entry<String, String> i : sourceMap.entrySet()) {
            System.out.println(i);
        }

        System.out.println();

        replaceKeyValue(sourceMap);

    }


    public static void replaceKeyValue(TreeMap<String, String> map) {
        for (int i = 0; i < map.size(); i++) {
            map.put(map.firstEntry().getValue(), map.pollFirstEntry().getKey());
        }

        for (Map.Entry<String, String> words : map.entrySet()) {
            System.out.println(words);
        }
    }

}
