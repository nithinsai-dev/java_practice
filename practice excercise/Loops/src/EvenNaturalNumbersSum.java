public class EvenNaturalNumbersSum {
    public static void main(String[] args){
        int n=5;
        int sum = 0;
        System.out.println("the even numbers are  : ");
        for (int i=1;i<=n;i++){
            System.out.print(2*i + " ");
            sum += 2*i;
        }
        System.out.println();
        System.out.println("sum : " + sum);
    }
}
