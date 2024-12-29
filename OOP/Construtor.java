public class Construtor {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = " PRACHI SINHA";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "jsnf";

        s1.marks[2] = 100;
        
        for(int i =0;i<3; i++) {
            System.out.println(s2.marks[i]);
        }

       
    }
}
    class Student{
        String name;
        int roll ;
        String password ;
        int marks[];

        // //shallow construtor
        // Student(Student s1) {//copy c....t
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;

            
        // }

        Student ( Student s1) {
            marks = new int[3];
          this.name = s1.name;
          this.roll = s1.roll;
          for(int i =0;i<3;i++) {
         this.marks[i] = s1.marks[i];
          }

          //this . marks direct nhi krege ek ekkarkrege loop lgayge 

        }




        Student(){ // non-paramereterzed constructor
            marks = new int[3];
            System.out.println("constructor ic called....");
          }

        Student(String name) { // paramer=trized constructor
            this.name = name;
            marks = new int[3];
            
        }

        Student (int roll){
            marks = new int[3];
            this.roll = roll;

        }
    }

