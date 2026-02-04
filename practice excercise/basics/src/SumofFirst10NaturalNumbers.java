public class SumofFirst10NaturalNumbers {
    public static void main(String[] args){
        int sum=0;
        System.out.println("the first 10 natural numbers is  : ");
        for (int i=1;i<11;i++) {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.println();
        System.out.println("sum : " + sum);
    }

}
