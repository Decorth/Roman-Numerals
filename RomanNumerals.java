// Map<Character, Integer> roman_map = new HashMap<Character, Integer>()
// 
// for (i = 0; i < s.length()) 
//
// 
// total = total + Map.get(s.charAt(i))
// unless exception where total = total + 4
//

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        Map<Character, Integer> roman_map = new HashMap<Character, Integer>();
        roman_map.put('I', 1);
        roman_map.put('V', 5);
        roman_map.put('X', 10);
        roman_map.put('L', 50);
        roman_map.put('C', 100);
        roman_map.put('D', 500);
        roman_map.put('M', 1000);
        for (int i = 0; i < s.length(); i++){
                total = total + roman_map.get(s.charAt(i));
        }
        
        if (s.contains("IV") || s.contains("IX")){total = total - 2;}
        if (s.contains("XL") || s.contains("XC")){total = total - 20;}
        if (s.contains("CM") || s.contains("CD")){total = total -200;}
        
        return total;
    }
}
