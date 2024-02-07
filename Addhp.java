import java.util.Scanner;
class Addhp{
    private String str;
    public Addhp(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string ");
        str=scan.nextLine();
    }
    public void check(){
        char ch=str.charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            str=str+"hp";
        else
            str=str.substring(0,1)+"hp"+str.substring(1);
    }
    public void display(){
        System.out.println("the modified string is "+str);
    }
    public static void main(String []agr){
        Addhp obj=new Addhp();
        obj.check();
        obj.display();
    }
}