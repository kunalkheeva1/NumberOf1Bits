public class NumberOf1Bits {


    public static int numberOf1Bits(int n){
        //initially count is 0
        int count =0;
        //until n becomes 0
        while(n>0){
            // if its one then increment count
            if((n&1)==1){
                count ++;
            }
            //else just move n to right side by one
            n >>=1;
        }return count;
    }

    public static void main(String[] args) {

    }
}
