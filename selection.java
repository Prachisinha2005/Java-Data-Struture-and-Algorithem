// User function Template for Java

class selection {
    public boolean isPossible(long a[], long b[], int n, long k){
        Arrays.sort(a, Collection.reverseOrder());
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]+b[i]<k){
                return false;
            }
            return true;
        }
    } 
        // Your code goes here
    }
    public static void main(Strings args[]){
        int a[] = {2,1,3};
        int b[] = {7,8,9};
        int k =10;
        int n = a.length;
         if(isPossible(a,b,n,k)){
             System.out.print('YES')
         }else{
             System.out.print('NO')
         }
    }

