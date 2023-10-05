import java.io.*;
import java.util.*;

class RomanToInteger {
    public static void main(String[] args) throws IOException {
        Solution obj=new Solution();
        System.out.println(obj.romanToDecimal("XV"));
        
    }
}
class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = map.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                res -= map.get(str.charAt(i));
            } else {
                res += map.get(str.charAt(i));
            }
        }
 
        return res;
    }
}
