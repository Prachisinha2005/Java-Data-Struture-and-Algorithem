public class PrimeRange {
    public static void primesInRange(int n){
        for(int i= 2;i<=n;i++){
            if(i==2){
                System.out.println(i+"");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primesInRange(20);
    }
    
}
