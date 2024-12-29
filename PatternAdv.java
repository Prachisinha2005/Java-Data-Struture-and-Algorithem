public class PatternAdv {
    public static void hollow_rectangle(int totRow, int totCols){
        for( int i =1;i<=totRow;i++){
            for(int j =1;j<=totCols;j++){
                if(i ==1 || i ==totRow || j ==1 || j== totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }

    }
    public static void inverted_rotated_half_pyramid(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" " );
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_withnum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+ "");
            }
            System.out.println();
        }
    }
    public static void floyids_triangle(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter++);
            }
            System.out.println();
        }
    }
    public static void solid_rombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
    //HOLLOW RHOMBUS PATTERN
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1|| i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

           
    }

    public static void main(String[] args) {
        //hollow_rectangle(4,5);
       // inverted_rotated_half_pyramid(7);
      /// inverted_half_pyramid_withnum(5);
      //floyids_triangle(5);
      //solid_rombus(5);
      hollow_rhombus(5);

        
    }}

