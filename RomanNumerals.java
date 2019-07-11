// Map<Character, Integer> roman_map = new HashMap<Character, Integer>()
//
// for (i = 0; i < s.length())
//
// if (s.charAt(i) == I && s.charAt(i+1) == V) do this for 6 exceptions
//
// total = total + Map.get(s.charAt(i))
// unless exception where total = total + 4
//

import java.util.HashMap;

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
       try{
            if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                total = total + 4;
                i = i+1;
            }
            else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                total = total + 9;
                i = i+1;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                total = total + 40;
                i = i+1;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                total = total + 90;
                i = i+1;
            }
            else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                total = total + 400;
                i = i+1;
                }
            else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                total = total + 900;
                i = i+1;
            }
            else{
                total = total + roman_map.get(s.charAt(i));
            }

        }
        catch (Exception e){
          total = total + roman_map.get(s.charAt(i));
        }
    }
    return total;
}
