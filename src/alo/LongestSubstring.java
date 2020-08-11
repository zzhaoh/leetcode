package alo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int i =0;
        Map<Character,Integer> map = new HashMap<>();
        for (int j =0;j<s.length();j++){
            if (map.containsKey(s.charAt(j))){
                i = map.get(s.charAt(j))+1;
            }
            ans = Math.max(ans,j+1-i);
            map.put(s.charAt(j+1),j+1);
        }
        return ans;
    }
}
