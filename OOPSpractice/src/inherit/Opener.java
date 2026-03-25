package inherit;

//Multilevel Inheritance (Cricketer -> Batsman -> Opener)
class Opener extends Batsman {

    Opener(String name) {
        super(name);
        this.role = "Opening Batsman";
    }
}