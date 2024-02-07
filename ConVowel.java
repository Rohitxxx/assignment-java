import java.util.*;
class ConVowel{
    public String str;
    public int nvowel,ncons;
    public ConVowel(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string ");
        str=scan.nextLine();
        nvowel=0;
        ncons=0;
    }
    public void check(){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                nvowel++;
            else
                ncons++;
        }
    }
    public void display(){
        System.out.println("the no. of vowel in the string is "+nvowel);
        System.out.println("the no. of consonent in the string is "+ncons);
    }
    public static void main(String []arg){
        ConVowel obj=new ConVowel();
        obj.check();
        obj.display();
    }
}