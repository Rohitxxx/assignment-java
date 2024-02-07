class AllahabadPattern{
    public static void main(String []args){
        String str="ALLAHABAD";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=str.length()-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
                System.out.print(str.charAt(k)+" ");
            System.out.println();
            
        }    
    }
}