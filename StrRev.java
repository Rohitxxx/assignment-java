import java.util.Scanner;
class StrRev{
    String str;
    char []ch;
    public StrRev(){
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
    public void pattern(){
        System.out.println();
        for(int i=str.length()-1;i>=0;i--){
            for(int j=str.length()-1;j>=i;j--)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    }
    public static void main(String args[]){
        StrRev obj=new StrRev();
        obj.reverse();
        obj.pattern();
    }
}