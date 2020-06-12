public class DaffodilNumber {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b=3;
        for (int i =0;i<a.length;i++){
            int x=b-a[i];
            int s=printArray(a,x);
            if (s!=-1){
                System.out.println(i);
                System.out.println(s);
            }
        }
    }
    public static int printArray(int[] array,int value){
        for(int i = 0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
}