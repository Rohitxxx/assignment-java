import java.util.Scanner;
class BubbleSort{
    private int[] arr;
    public BubbleSort(){
        System.out.println("Enter elements in the array");
        Scanner scan=new Scanner(System.in);
        arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();
        }
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
    public void display(){
        System.out.println("the sorted array is ");
        for(int i=0;i<5;i++)
            System.out.println(arr[i]+" ");
    }
    public static void main(String arg[]){
        BubbleSort b=new BubbleSort();
        b.bubble();
        b.display();
    }
}