public class Static {

     public static void main(String[] args) {
        String str = " a b b c";
        System.err.println(StringLength(str ));
    //     student s1 = new student();
    //     s1.schoolname="dav";
    //     student s2 = new student();
       

    //     student s3 = new student();
    //     s3.schoolname="stsv";
    //     System.out.println(s3.schoolname);

    // }
    


}
public static int StringLength(String str){
    if(str.length == 0 ){
        return 0;
    }
    return(str.length(1)) + 1;
}

class student {
    int returnpercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }

    String name;
    int rollno;

    static String schoolname;

    void setname (String name) {
        this.name = name;

    }

    void getname () {
        this.name = name;
        
    }
}}
