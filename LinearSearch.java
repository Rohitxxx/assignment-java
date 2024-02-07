import java.util.Scanner;
class LinearSearch{
    private int[] arr;
    private int item;
    public LinearSearch(){
        System.out.println("Enter elements in the array");
        Scanner scan=new Scanner(System.in);
        arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the element to be searched");
        item=scan.nextInt();
    }
    public boolean linearSearch(){
        for(int i=0;i<5;i++){
            if(item==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        LinearSearch obj=new LinearSearch();
        if(obj.linearSearch()){
            System.out.println("item found");
        }
        else
            System.out.println("item not found");
    }
}