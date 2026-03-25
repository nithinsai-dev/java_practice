package inherit;

class AllRounder extends Cricketer implements AllRounderSkills {

    AllRounder(String name) {
        super(name, "All-Rounder");
    }

    public void skillSet() {
        System.out.println("-> Can bat and bowl equally well.");
    }
}
