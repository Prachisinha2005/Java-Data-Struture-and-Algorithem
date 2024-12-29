public class PrimeCheck {
   /* public static boolean isPrime (int n) {
       boolean isPrime = true;
       for(int i=2;i<=n-1;i++){
            if(n% i ==0){
            isPrime=false;
            break;
        }
       }
       return isPrime;

    }
    public static void main(String args[]) {
        System.out.println(isPrime(12));
    } */
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n);i++){
            if(n% i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void primesInRange(int n){
        for(int i= 2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+"");
            }
        }
        System.out.println();
    }
    public static void binToDec (int binNum) {
        int myNum = n;
        int pow = 0;
        int DecNum = 0;

        while (binNum > 0){
            int lastDigit = binNum % 10;
            DecNum= DecNum + (lastDigit *(int) Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum+" = " + binNum);

    }
    public static void main(String args[]){
        binToDec(1010);
    }

    }



