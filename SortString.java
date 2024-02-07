import java.util.Scanner;
class SortString{
    String []str;
    public SortString(){
        str=new String[5];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 strings");
        for(int i=0;i<5;i++)
            str[i]=scan.nextLine();
    }
    public void mySort(){
        String s,temp;
        for(int j=0;j<=4;j++){
        for(int i=j+1;i<5;i++){
           // s=str[i-1];
            if(str[j].compareTo(str[i])>0){
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
    }
    public void display(){
        System.out.println("the sorted string is ");
        for(int i=0;i<5;i++){
            System.out.println(str[i]);
        }
    }
    public static void main(String args[]){
        SortString obj=new SortString();
        obj.mySort();
        obj.display();
    }
}