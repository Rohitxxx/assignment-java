import java.util.Scanner;
class MyStr{
    private String str1,str2;
    public boolean myCompare(String s1,String s2){
        str1=s1;
        str2=s2;
        char []ch1=str1.toCharArray();
        char []ch2=str2.toCharArray();
        for(int i=0;i<str1.length();i++){
            if(ch1[i]!=ch2[i])
                return false;
        }
        return true;
    }
    public String concatStr(String s1,String s2){
        str1=s1;
        str2=s2;
        return str1+str2;
    }
    
    public static void main(String args[]){
        MyStr obj=new MyStr();
        String st="rohit";
       if( obj.myCompare(st,"rohit")){
           System.out.println("the strings matches");
       }
       else
            System.out.println("does not matches");
        System.out.println(obj.concatStr(st," maurya"));
    }
}