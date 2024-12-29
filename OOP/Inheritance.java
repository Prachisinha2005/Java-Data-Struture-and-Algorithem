public class Inheritance {

    public static void main (String args[]){
        // Fish shark = new Fish(); //
        // shark.eat(); //by deafult eat function auto matic aayga kyuki animal me properties hai bhale hi wo fish ke ander na ho|
       bird peacock = new bird();
       peacock.eat();
       peacock.fly();
       peacock.breathe();
    }
    
}
class Animal {
    String color; //class ki properties
    void eat() { //function 
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}
class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class fish extends Animal {
    void swim(){
        System.out.println("swim in see");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("fly in tha sky");

    }
}

    //Derived class
    //extend means khichna animal class ki properties fish class me khich ke la rhi hai

    // class Fish extends Animal { // animal class ki sari properties fosh ke ander aa chukihai 
    //     int fins; //fish ki additionl properties

    //     void swim(){
    //         System.out.println("swim in water");
    // }

    
    // }
