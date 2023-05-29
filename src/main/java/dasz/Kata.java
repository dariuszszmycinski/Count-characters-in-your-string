package dasz;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> chars = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (chars.containsKey(c)){
                chars.put(c, chars.get(c)+1);
            }else {
                chars.put(c,1);
            }
        }
        return chars;
    }
}
