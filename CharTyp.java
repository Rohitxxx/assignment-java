import java.util.Scanner;
class CharTyp{
    private String str;
    private int space,capital,small,symbol,digit;
    char ch;
    public CharTyp(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string to test");
        str=scan.nextLine();
        //space=capital=small=symbol=0;

    }
    public void check(){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
                small++;
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                capital++;
            else if(str.charAt(i)==' ')
                space++;
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                digit++;
            else
                symbol++;
          //  if(str.charAt(i))
        }

    }
    public void display(){
        System.out.println("the no of small character is "+small);
        System.out.println("the no of capital letter character is "+capital);
        System.out.println("the no.of space in the string is "+space);
        System.out.println("the no. of special character in the string is "+symbol);
        System.out.println("the no. of digit in the string is "+digit);
    }
    public static void main(String []args){
        CharTyp obj=new CharTyp();
        obj.check();
        obj.display();
    }
}