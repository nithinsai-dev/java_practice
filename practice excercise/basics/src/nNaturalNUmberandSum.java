public class nNaturalNUmberandSum {
    public static void main(String[] args) {
        int n=7;
        int sum =0;
        for (int i=1;i<n+1;i++) {
            System.out.print(i + " ");
            sum += i ;
        }
        System.out.println();
        System.out.print("sum : " + sum);
    }
}
