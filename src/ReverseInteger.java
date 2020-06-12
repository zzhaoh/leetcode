//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。



//解题思路：简单的数学思想  将数字的末位放入转换数字的头便可以做到反转

//关键是判断溢出情况  1.  因为rev=rev*10+pop  所以当rev>2的31次方-1  即前一个rev>Integer.MAX_VALUE/10的时候  溢出
//                   2.  当rev=Integer.MAX_VALUE/10并且pop>7的时候溢出   因为7是2的31次方-1的个位数
//  负数情况相同   -8是2的-31次方的个数
public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
