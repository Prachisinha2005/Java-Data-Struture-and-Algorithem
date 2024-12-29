public class Rotate_array {
    public static int search(int arr[] , int tar,int si,int ei){
        int mid = si + ei/2;
        // base case
        if(si>ei){
            retrun -1;
        }
        //case found
        if(tar==arr[mid]){
            return mid;
        }
         
        //midon l1
        if(arr[si]<=mid){
            if(arr[si]<=tar&& tar<= arr[mid])
            return search(arr, tar, si, mid-1);
        }
        else{
            return search(arr, tar, mid+1, ei);
        }
        
        // case on l2
        else{
            if(arr[mid]<=tar&& tar<=arr[ei]){
                return search(arr, tar, mid +1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        
        }
    
    
    public static void main(String[] args) {
        int arr[]  ={4,5,6,7,0,1,2};
        int tar = 0;
        int tarindx = search(arr, tar, 0, arr.length-1);
        System.out.println(tarindx);
    }
}

