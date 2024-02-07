import java.util.Scanner;
class Num{
    private int num;
    public Num(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a no. to perform operations");
        num=scan.nextInt();
    }
    public void factor(){
        int temp=num;
        System.out.print("1");
        for(int i=2;temp>1;i++){
            if(temp%i==0){
                System.out.print(","+i);
                temp=temp/i;
            }
        }
    }
    public void factorial(){
        long temp=1;
        System.out.println("1");
        for(int i=2;i<=num;i++){
            System.out.print("x"+i);
            temp=i*temp;
        }
        System.out.print("="+temp);
    }
    public void menu(){
        int opt;
     while(true){
        Scanner scan=new Scanner(System.in);
        System.out.println("***Select the any one option*** ");
        System.out.println("1.Factor");
        System.out.println("2.Factorial");
        System.out.println("3.exit");
        opt=scan.nextInt();
        switch(opt){
            case 1:this.factor();
                    break;
            case 2:this.factorial();
                    break;
            case 3:System.exit(0);
                    break;
            default:System.out.println("Invalid choice");
        }
        System.out.println("press any key to clear screen");
        scan.next();
        System.out.println("\033[H\033[2J");
        System.out.flush();
     } 
    }
}
class Demo{
    public static void main(String args[]){
        Num obj=new Num();
        obj.menu();
    }
}