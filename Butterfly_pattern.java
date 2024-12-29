public class Butterfly_pattern {
    public static void butterfly(int n){
        //first half
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }

        for(int j=1;j<=2*(n-i);j++){
         System.out.print(" ");
        }

        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }

        for(int j=1;j<=2*(n-i);j++){
         System.out.print(" ");
        }

        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println( );

     
    }

}
//DIAMOND PATTERN
public static void diamond_pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print('*');
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print('*');
        }
        System.out.println();

    }


}
public static void palindromicpattern(int n){
    for(int i=1; i<=n; i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    
}

   
public static void main(String[] args) {
    //butterfly(6);
   // diamond_pattern(3);
   palindromicpattern(5);
}
}
