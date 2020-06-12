//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int y =x;
        int rev = 0;
        if (x<0||0==x%10&&x!=0){return false;}
       while (x>rev){
           int pop = x%10;
           x/=10;
           rev = rev*10+pop;
        }
        if (rev==y){return true;}
        return false;
    }
}
