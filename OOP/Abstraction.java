//import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Abstraction {

    public static void main(String args[]){
        Mustang myhorse = new Mustang();
        
        // Horse H =  new Horse();
        // H.walk();
        // H.eat();
        // H.color();
    }
       
}
abstract class Animal {
    String color;
    //constructor
    Animal() {
        System.out.println("Animal comstructor callaed");

    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

//sub class
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = " dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{ 
    Mustang() {
        System.out.println("Muastang constructor clled");
    }
}
