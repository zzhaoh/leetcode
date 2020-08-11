package alo;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length<=0){
            return "";
        }
        String Prefix = "";
        int len = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < len) {
                len = strs[i].length();
            }
        }
        for (int i = 0; i < len; i++) {
            int num = 0;
            for (int j = 0; j < strs.length-1;j++ ) {
                if (strs[j].charAt(i) == strs[j+1].charAt(i)) {
                   num++;
                }
            }
            if (num == strs.length-1){
                Prefix+=strs[0].charAt(i);
            }else {
                return Prefix;
            }
        }
        return Prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs= {"flower","flow","flight"};
        longestCommonPrefix.longestCommonPrefix(strs);
    }
}
