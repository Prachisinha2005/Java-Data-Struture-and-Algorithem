public class largest_no {
    public static void getLargest(int number[]){
        int largest = Integer.Min_Value;

        for(int i=0;i<number.length;i++) {
            if(largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
        
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,4,5};
        System.out.println(getLargest(number));
    }
}
