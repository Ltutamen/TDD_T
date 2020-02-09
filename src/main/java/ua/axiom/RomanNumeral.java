package ua.axiom;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
    private static Map<Integer, String>  romanMap = new LinkedHashMap<Integer, String>();

    static {
        romanMap.put(500, "D");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IV");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1,  "I");

    }


    public String intToRoman(int arabic) {
        StringBuilder roman = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (arabic >= entry.getKey()) {
                roman.append(entry.getValue());
                arabic -= entry.getKey();
            }
        }

        return roman.toString();
    }
}
