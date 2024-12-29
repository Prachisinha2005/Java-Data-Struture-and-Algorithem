
public class ArraysCC {
    public static void main (String[] args){
        int[] arr = {12, 34, 10, 6, 40};
        int target = 6;
        int result = arraysCC (arr, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int arraysCC(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index where the element is found
            }
        }
        return -1; // return -1 if the element is not found
    }

    }

