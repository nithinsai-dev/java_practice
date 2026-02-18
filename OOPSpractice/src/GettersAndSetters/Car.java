package GettersAndSetters;

public class Car {
    private String model;
    private String colour;
    private int price;

    Car(String model,String colour,int price){
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    String getColour(){
        return this.colour;
    }
    String getModel(){
        return this.model;
    }
    int getPrice(){
        return this.price;
    }

    void setColour(String colour){
        this.colour = colour;
    }
    void setPrice(int price){
        this.price = price;
    }
}
