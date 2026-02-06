public class FloydsTriangle {
    public static void main(String[] args){
        int rows = 5;
        int n = 1;
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(n);
                if (n==1){
                    n=0;
                }
                else{
                    n=1;
                }
            }
            System.out.println();
        }
    }
}
