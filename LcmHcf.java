import java.util.Scanner;
class Lcm{
    private int num;
    public Lcm(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no to find lcm");
        num=scan.nextInt();
    }
    public void lcm(){
        while(num>=2){
        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                num=num/i;
                break;
            }
        }
    }
    }
}
class Hcf{
    private int[] numarr;
    int n;
    public Hcf(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of n");
        n=scan.nextInt();
        numarr=new int[n];
        System.out.println("enter the numbers to find hcf");
        for(int i=0;i<n;i++){
            numarr[i]=scan.nextInt();
        }
    }
    public int hcf(){
        int result=numarr[0];
        for(int i=1;i<n;i++){
            result=realhcf(result,numarr[i]);
        }
        return result;
    }
    public int realhcf(int num1,int num2){
        int temp;
        if(num1>num2){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        while(num1%num2==0){
            temp=num1%num2;
            num2=num1;
            num1=temp;
        }
        return num1;
    }
}
public class LcmHcf{
    public static void main(String args[]){
        Lcm l=new Lcm();
        l.lcm();
        Hcf h=new Hcf();
       System.out.println("the hcf is "+h.hcf());
    }
}