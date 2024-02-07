import java.util.Scanner;
class StrRev1{
    String str;
    char []ch;
    public StrRev1(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string ");
        str=scan.nextLine();
        ch=str.toCharArray();
    }
    public void reverse(){
        System.out.print("the reverse of "+str+" is ");
        for(int i=str.length()-1;i>=0;i--)
            System.out.print(ch[i]);
    }
    public void menu(){
        System.out.println("***Choose any Option***");
        System.out.println("1.Length of the string");
        System.out.println("2.reverse the string");
        System.out.println("enter your choice");
        Scanner scan=new Scanner(System.in);
        int c=scan.nextInt();
        switch (c) {
            case 1:
            System.out.println("the length of the string is"+this.getLength());
            break;
            case 2:
            this.reverse();
                break;
            default:
                System.out.println("invalid selection");
                break;
        }
        
    }
    public int getLength(){
        return str.length();
    }
    public static void main(String []arg){
        StrRev1 o=new StrRev1();
        o.menu();
    }
}