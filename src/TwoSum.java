import java.util.HashMap;
import java.util.Map;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/two-sum
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {//暴力解法
        for (int i = 0; i < nums.length; i++) {//循环一次数组
            for (int j = i+1;j<nums.length;j++){//j比i   大一位避免自身相加
                if (nums[j]==target-nums[i]){//如果nums[j]+nums[i]=目标数值
                    return new int[]{i,j};//返回一个新数组，值为两个数组的下标
                }
            }
        }
        int[] array = new int[0];  //如果找不到，返回一个新数组
        return array;
    }
    //暴力解法相当于遍历两次数组，时间复杂度为O(n^2)
    //空间复杂度为O(1)，并没有开辟新的内存


    //两遍哈希表
    public int[] twoSumWithTwoMap(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();//定义一个哈希表
        for (int i =0;i<nums.length;i++){
            map.put(nums[i],i);//每次循环都将当前的值作为Key，下标作为Value存入Map中
        }//循环结束得到一个存有所有nums中的值和下标的哈希表
        for (int i =0;i<nums.length;i++){
            int theNum = target- nums[i];//定义一个符合对应值条件的变量theNum
            if (map.containsKey(theNum)&&map.get(theNum)!=i){//如果表中存在theNum并且这个不是自身
                return new int[]{i,map.get(theNum)};//返回一个数组，值为两个数的下标
            }
        }
        return new int[]{};
    }
    //两遍哈希表对数组遍历一次，对哈希表遍历一次，但是哈希表的查找时间为O（1），所以时间复杂度为O(n)
    //空间复杂度为O(n)    开辟了一个哈希表的内存，而哈希表中存了n个元素 n=nums.length


    //一遍哈希表
    public int[] twoSumWithOneMap(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();//定义一个哈希表
        for (int i =0;i<nums.length;i++){//遍历数组
            int theNum = target - nums[i];//定义符合条件的变量
            if (map.containsKey(theNum)){//如果哈希表中存在符合条件的变量   因为当前值还没有存入哈希表，所以不用担心会找到自身
                return new int[]{map.get(theNum),i};//直接返回新数组
            }
            map.put(nums[i],i);  //如果没有的话，哈希表中存入值以及对应的下标
        }
        return new int[]{};
    }
}

