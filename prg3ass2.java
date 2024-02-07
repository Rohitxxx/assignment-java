import java.util.Scanner;
class Purchase{
    private String name;
    private String address;
    private String ptype;
    private float amount;
    private float discount;
    public Purchase(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the type of product(laptop/desktop)");
        ptype=scan.next();
        System.out.println("Enter the amount of product");
        amount=scan.nextFloat();
        System.out.println("Enter the name of customer");
        name=scan.nextLine();
        System.out.println("Enter the address of the customer");
        address=scan.nextLine();
    }
    public void netAmount(){
        if(amount<=25000){
            if(ptype.equals("laptop")||ptype.equals("LAPTOP"))
                discount=0f;
            else
                discount=5f;
        }
        else if(amount>25000&&amount<=57000){
            if(ptype.equals("laptop")||ptype.equals("LAPTOP"))
                discount=5f;
            else
                discount=7.6f;
        }
        else if(amount>57000||amount<=100000){
            if(ptype.equals("laptop")||ptype.equals("LAPTOP"))
                discount=7.5f;
            else
                discount=10.0f;
        }
        else {
            if(ptype.equals("laptop")||ptype.equals("LAPTOP"))
                discount=10.0f;
            else
                discount=15.0f;
        }
    }
    public void bill(){
        amount=amount-(amount*discount/100);
        System.out.println(name+"\n"+address+"\nnet amount is"+amount);
    }
    public static void main(String agr[]){
        Purchase p=new Purchase();
        p.netAmount();
        p.bill();       
    }
}