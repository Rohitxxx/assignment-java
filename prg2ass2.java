import java.util.Scanner;
class Person{
    private int age;
    private String gender;
    private float income;
    public Person(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        age=scan.nextInt();
        System.out.println("Enter your gender(m/f)");
        gender=scan.next();
        System.out.println("Enter your income");
        income=scan.nextFloat();
    }
    public void tax(){
        if(age>65||gender.equals("f")||gender.equals("F")){
            System.out.println("Wrong category");
        }
        else{
            if(income<160000){
                System.out.println("nill");
            }
            else if(income>160000&&income<=500000){
                System.out.println((income-160000)*0.1f);
            }
            else if(income>500000&&income<=800000){
                System.out.println(((income-500000)*0.2f+34000));
            }
            else{
                System.out.println(((income-800000)*0.3f+94000));
            }
        }
    }
    public static void main(String args[]){
        Person obj=new Person();
        obj.tax();
    }
}