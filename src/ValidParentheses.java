import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public int strStr(String haystack, String needle) {

        Map<String,String> map1 = new HashMap<>();
        map1.put("1","a");
        map1.put("2","b");
        map1.put("3","c");
        map1.put("4","d");
        map1.put("5","e");
        map1.put("6","f");
        map1.put("7","g");
        map1.put("8","h");
        map1.put("9","i");
        map1.put("10#","j");
        map1.put("11#","k");
        map1.put("12#","l");
        map1.put("13#","m");
        map1.put("14#","n");
        map1.put("15#","o");
        map1.put("16#","p");
        map1.put("17#","q");
        map1.put("18#","r");
        map1.put("19#","s");
        map1.put("20#","t");
        map1.put("21#","u");
        map1.put("22#","v");
        map1.put("23#","w");
        map1.put("24#","x");
        map1.put("25#","y");
        map1.put("26#","z");
        return haystack.indexOf(needle);

    }

}
