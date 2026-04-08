package Calculator;

public class Number {
    private double value;

    // Constructor
    public Number(double value){
        this.value = value;
    }

    // Getter
    public double getValue() {
        return value;
    }

    // Instance methods (IMPORTANT CHANGE)
    public double add(Number n){
        return this.value + n.value;
    }

    public double subtract(Number n){
        return this.value - n.value;
    }

    public double multiply(Number n){
        return this.value * n.value;
    }

    public double divide(Number n){
        if(n.value == 0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return this.value / n.value;
    }
}