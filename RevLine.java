import java.util.Scanner;
class RevLine{
    String str;
    char []ch;
    public RevLine(){
        System.out.println("enter the string");
        Scanner scan=new Scanner(System.in);
        str=scan.nextLine();
    }
    public void display(){
        ch=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
    public static void main(String arg[]){
        RevLine obj=new RevLine();
        obj.display();
    }
}