public class Overloading {

    public static void main (String args[]){
        // Calculator calc =  new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.3,(float)3.3));
        // System.out.println(calc.sum(1,2,3));
        deer d = new deer();
        d.eats();


    }
    
}

class Animal {
    void eats(){
        System.out.println("eats anything");
    }


}

class deer extends Animal {

    void eats() {
        System.out.println("eat only grass");
    }
}

class Calculator {
    int sum(int a , int b){
        return a+b;
    }

    float sum(float a , float b){
        return a+b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }
}
