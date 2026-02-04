public class MultiplicationTable {
    public static void main(String[] args){
        int n = 15;
        for (int i=1;i<11;i++) {
            System.out.printf("%d * %d = %d", n, i, n * i);
            System.out.println();
        }
    }
}
