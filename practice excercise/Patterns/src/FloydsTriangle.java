public class FloydsTriangle {
    public static void main(String[] args){
        int rows = 5;
        for (int i=1;i<=rows;i++){
            int n = (i % 2 == 1) ? 1 : 0;
            for (int j=1;j<=i;j++){
                System.out.print(n);
                n = (n==1) ? 0:1;
            }
            System.out.println();
        }
    }
}
