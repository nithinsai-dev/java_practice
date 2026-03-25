package inherit;
class Cricketer {

    String name;
    String role;

    Cricketer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void displayInfo() {
        System.out.println("Role: [" + role + "] | Name: " + name);
    }
}
