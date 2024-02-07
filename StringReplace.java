import java.util.Scanner;
class StringReplace{
    private String str;
    private String substr;
    private String repstr;
    public StringReplace(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        str=scan.nextLine();
        System.out.println("Enter the substring which is to be replaced");
        substr=scan.nextLine();
        System.out.println("Enter the new string to insert");
        repstr=scan.nextLine();
    }
 
    public void modify(){
        int index=str.indexOf(substr);
        str=str.substring(0,index)+repstr+str.substring(repstr.length()+index);
    }
    public void display(){
        System.out.println("the modified string is "+str);
    }
    public static void main(String []args){
        StringReplace obj=new StringReplace();
        obj.modify();
        obj.display();
    }
}