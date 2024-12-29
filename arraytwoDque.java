public class arraytwoDque {
    public static void printno ( int[][] matrix,int key){
       int count = 0 ;
       for(int i =0;i<matrix.length;i++){
           for(int j =0;j<matrix[i].length;j++){
            if(matrix[i][j] == key){
                count ++;
                
            }
           }
        
           System.out.println(key+count);
           count =0;
        }
    }
   
       
    public static void main(String args[]){
      // int matrix[][] = { { 4,7,8},
                         // { 8,8,7}};
   
    //printno(matrix,7);
       
        int[][] nums = {{1,4,9},
                     {11,4,3},{2,2,3}};
        int sum = 0;             
         for(int i=0;i<nums.length;i++){
        sum += nums[1][i];
        }
        System.out.println(sum);
        }
    }
    
