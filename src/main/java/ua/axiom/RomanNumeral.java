package ua.axiom;

public class RomanNumeral {
    public String intToRoman(int arabic) {
        StringBuilder roman = new StringBuilder();

        while (arabic >= 10) {
            roman.append("X");
            arabic -= 10;
        }

        while (arabic > 0) {
            roman.append("I");
            arabic -= 1;
        }

        return roman.toString();
    }
}
