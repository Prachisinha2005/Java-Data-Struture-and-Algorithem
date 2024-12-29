public class QuickSort {
    public static void printarr(int arr[]){
        //for count elemnet in arrY
        for(int i = 0; i<arr.length;i++ ){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void quickSort(int arr[] , int si , int ei){
        //recursuin function
        // base class
        if(si>=ei){
            return;
        }
        //last element
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1); //left
        quickSort(arr, pidx+1, ei); //right


    }

    public static int partition(int arr[] , int si , int ei){
        //most important part
        int pivot = arr[ei];
        int i = si-1;//to make place for els smaller than pivot
        for(int j = si ; j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]  = temp;
            }
        }
        i++;
        int temp = pivot ;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
                
    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
    
}
