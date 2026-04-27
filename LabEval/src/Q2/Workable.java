package Q2;

public interface Workable {
    public void doWork();

    default void logWork(){
        System.out.println("Work logged for employee");
    }
}
