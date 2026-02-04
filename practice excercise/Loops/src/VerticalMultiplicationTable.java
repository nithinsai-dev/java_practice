public class VerticalMultiplicationTable {
    public static void main(String[] args){
        int n = 8;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=10;j++){
                System.out.printf("%d * %d = %d",i,j,i*j);
            }
            System.out.println();
        }
    }
}
