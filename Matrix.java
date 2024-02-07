import java.util.Scanner;
class Matrix{
    private int [][]mat;
    public Matrix(){
        Scanner scan=new Scanner(System.in);
        mat=new int[3][3];
        System.out.println("enter the matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=scan.nextInt();
            }
        }
    }
    public int small(){
        int s=mat[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(s>mat[i][j])
                    s=mat[i][j];
            }
        }
        return s;
    }
    public int big(){
        int b=mat[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(b<mat[i][j])
                    b=mat[i][j];
            }
        }
        return b;
    }
    public void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String agr[]){
        Matrix m=new Matrix();
       System.out.println(m.small());
        System.out.println(m.big());
        m.display();
    }
}