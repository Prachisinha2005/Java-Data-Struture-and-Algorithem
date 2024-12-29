import java.util.*;
public class binary_no {
    public static void binarysearch(int numbers[] , int key){
        int start=0, end = numbers.length-1;

        while (start <=end){
            int mid = (start + end)/2;
            //comparison
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key =4;
        System.out.println("index for key is"+ binarysearch(numbers[],key));
    }

    
}
