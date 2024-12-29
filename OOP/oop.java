public class Construtor{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // create a pen obect called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "prachisinha";
        myAcc.setPassword("njndj");
    }
    
}

class Pen { 
     private String color;
    private int tip;
    //function
    String getColor (){ 
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
           
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = tip;
    }
}

