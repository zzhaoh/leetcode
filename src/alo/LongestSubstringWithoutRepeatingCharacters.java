package alo;

import java.util.HashMap;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//滑动窗口算法，适用于解决数组或字符串的子序列问题
//只会遍历一遍字符串，时间复杂度为O(n),map中最多存储所有char字符，最多情况为每个字符都不一样，空间复杂度为O(n)
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s==null)return 0;
        HashMap<Character, Integer> map = new HashMap<>();//用于记录字符下标
        int len = s.length();
        int result = 0;
        for (int i = 0, j = 0; j < len; j++) {
            if (map.containsKey(s.charAt(j))) {
                if (!(i>map.get(s.charAt(j)))){
                    i = map.get(s.charAt(j)) + 1;//如果当前元素已经存在且下标大于当前i的下标，则将i设为已存在元素下标+1
                }
            }
            if ((j - i + 1) > result) {
                result = j - i + 1;
            }
            map.put(s.charAt(j), j);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ab空a空";
        System.out.println(str.length());
        System.out.println(lengthOfLongestSubstring(str));
    }
    /**最暴力解法，双重遍历字符串列出所有字串，再判断字串是否重复，超时
     *     public static int lengthOfLongestSubstring(String s) {
     *         if (s==null||s.length()==0){
     *             return 0;
     *         }
     *         if (s.length()==1){
     *             return 1;
     *         }
     *         int result = 0;
     *         for (int i = 0; i < s.length(); i++) {
     *             for (int j = i+1; j < s.length(); j++) {
     *                 String str = s.substring(i,j);
     *                 if (isNotRepeating(str)){
     *                     if (str.length()>result){
     *                         result = str.length();
     *                     }
     *                 }
     *             }
     *         }
     *         return result;
     *     }
     *     public static boolean isNotRepeating(String s){
     *         if (s.length()==1){
     *             return true;
     *         }
     *         char[] chars = s.toCharArray();
     *         for (char e:chars) {
     *             if (s.indexOf(e)!=s.lastIndexOf(e)){
     *                 return false;
     *             }
     *         }
     *         return true;
     *     }
     *
     *
     */
}
