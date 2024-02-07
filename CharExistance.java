import java.util.Scanner;
class CharExistance{
    private String str;
    private char ch;
    private int occurance;
    public CharExistance(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string ");
        str=scan.nextLine();
        System.out.println("Enter the character to check the existance ");
        ch=scan.next().charAt(0);
        occurance=0;
    }
    public void check(){
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i))
                occurance++;
        }
        if(occurance==0)
            System.out.println("character does not exist in the given string");
        else
            System.out.println("character exist in the string "+occurance+" times");
    }
    public static void main(String []args){
        CharExistance obj=new CharExistance();
        obj.check();
    }
}