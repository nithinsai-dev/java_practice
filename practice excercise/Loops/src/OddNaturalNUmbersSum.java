public class OddNaturalNUmbersSum {
    public static void main(String[] args){
        int n=10;
        int sum = 0;
        for (int i =0;i<n;i++){
            int n1 = (2*i) + 1;
            System.out.print(n1 + " ");
            sum += n1;
        }
        System.out.println();
        System.out.println("sum : " + sum);
    }
}
