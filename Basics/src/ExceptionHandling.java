import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        try {
//            System.out.println("Enter the number : ");
//            int n = scanner.nextInt();
//            System.out.println(1/0);
            System.out.println(arr[9]);
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        } catch (InputMismatchException e){
            System.out.println("The datatype is wronmg");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array has less size than u ask");
        } catch (Exception e){
            System.out.println("Something went wrong");
        } finally{
            scanner.close();
        }
    }
}
