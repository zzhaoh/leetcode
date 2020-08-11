package alo;

public class ContainerWithMostWater {
    /**
     *双指针法
     * i,j指针分别指向数组两端，然后取i,j中较小的一个指针向中间移动，知道i=j
     * 记录最大容量，返回
     */
    public int maxArea(int[] height) {
        int max = 0,i = 0,j = height.length-1;
        while(i<j){
            int volume = (j-i)*Math.min(height[i],height[j]);
            if(volume>max)max = volume;
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
//暴力解法，两次遍历数组，找出所有容器取最大值，耗时384ms
//    public int maxArea(int[] height) {
//        int max = 0;
//        for(int i = 0;i<height.length;i++){
//            for(int j = i+1;j<height.length;j++){
//                int volume = (j-i)*Math.min(height[i],height[j]);
//                if(volume>max){
//                    max = volume;
//                }
//            }
//        }
//        return max;
//    }
}
