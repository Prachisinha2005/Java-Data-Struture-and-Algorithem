public class BitManipulation {
    public static void oddorEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    //public static int clearithBit(int n,int i){
      //  int bitMask = ~(1<<i);
        //return n&bitMask; 

    //}
    public static int updateithbit(int n , int  i , int newbit){
        n = clearithbit(n, i);
        int bitMask = newbit <<i;
        return n | bitMask;
    }
    public static int clearithbit(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearBitsinRange(int n, int i ,int j) {
        int a = ((~ 0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b ; 
        return n & bitMask;
    }

    public static void main(String[] args) {
       System.out.println(clearBitsinRange(2,4));

    }
}
