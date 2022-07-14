public class NumberOf1Bits {
    public static int numberOf1Bits(int n){
        int count =0;
        while(n>0){
            if((n&1)==1){
                count ++;
            }
            n >>=1;
        }return count;
    }

    public static void main(String[] args) {

    }
}
