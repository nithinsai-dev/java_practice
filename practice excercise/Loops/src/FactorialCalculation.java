public class FactorialCalculation {
    public static void main(String[] args){
        int result = 1;
        int n = 5;
        for (int i=1;i<=n;i++){
            result *= i;
        }
        System.out.println("The result is : " + result);
    }
}
