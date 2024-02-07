import java.util.Scanner;
class StringPos{
    private String str;
    private int pos;
    private String ch;
    public StringPos(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        str=scan.nextLine();
        System.out.println("Enter the position to replace character");
        pos=scan.nextInt();
        System.out.println("Enter the character to insert");
        ch=scan.next();
    }
    public void replaceChar(){
        str=str.substring(0,pos-1)+ch+str.substring(pos);

    }
    public void display(){
        System.out.println("the edited string is "+str);
    }
    public static void main(String []arg){
        StringPos obj=new StringPos();
        obj.replaceChar();
        obj.display();
    }
}