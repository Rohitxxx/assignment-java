import java.util.Scanner;
class BinarySearch{
    private int[] arr;
    private int item;
    public BinarySearch(){
        System.out.println("Enter elements in the array");
        Scanner scan=new Scanner(System.in);
        arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the element to be searched");
        item=scan.nextInt();
    }
    public void bubble(){
        int temp;
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public boolean binarySearch(){
        int b=5;
        int a=0;
        for(int i=0;i<5;i++){
            if(item==arr[b/2]){
                return true;
            }
            else if(item<arr[b/2])
                b=b/2;
            else 
                a=b/2;
        }
        return false;
    }
    public void display(){
        System.out.println("the sorted array is ");
        for(int i=0;i<5;i++)
            System.out.println(arr[i]+" ");
    }
    public static void main(String args[]){
        BinarySearch obj=new BinarySearch();
        obj.bubble();
        obj.display();
        if(obj.binarySearch()){
            System.out.println("item found");
        }
        else
            System.out.println("item not found");
    }
}