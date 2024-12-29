import java.util.*;

public class Linear_array {
    public static int linearsearch(int[] arr, int key) {
        for (int i=0 ; i < arr.length;i++){
            if (arr[i] == key;) {
                return i++;
                
            }
        
             
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {15,8,42,23,8,16,4,8};
        int key = 8;
        
        int result = linearsearch(arr, key);
        if(result != -1){
            System.out.println("Elemet font at index "+ result);

        }
        else{
            System.out.println("elment is not find");
        }
    }

}    