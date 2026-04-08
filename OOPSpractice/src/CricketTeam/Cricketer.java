package CricketTeam;

public class Cricketer {
    private String name;
    private String country;
    private int age;

    Cricketer(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    void displayProfile() {
        System.out.println("Name : " + this.name + " | Country " + this.country + " | age : " + this.age);

    }

    String getName(){
        return this.name;
    }

    String getCountry(){
        return this.country;
    }

    int getAge(){
        return this.age;
    }
}
