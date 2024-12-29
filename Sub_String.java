public class Sub_String {
    public static String substring(String str,int si,int ei){
        Sting substr = "2";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    
    public static void main(String args[]){
        //substring
        String str = "HelloWorld";
        System.out.println(substring(str,0,5));
    }
    
}

