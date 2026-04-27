package Q1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Nithin", 2000, 3.5);
        acc.display();
        acc.withdraw(1400);  // should work
        acc.withdraw(500);   // should trigger minimum balance message
    }
}