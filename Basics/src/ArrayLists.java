import java.util.*;


public class ArrayLists {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        System.out.print("enter the number of elements : ");
        int n = scanner.nextInt();

        for (int i=0;i<n;i++){
            System.out.print("enter the element : ");
            int d = scanner.nextInt();
            a.add(d);
        }

        System.out.println(a);

        scanner.close();


        //Adding
        //a.add()
        //a.set( , )

        //remove
        //a.remove();
    }
}
