package StaticKeyword;

public class Friend {

    // static makes the attribute common for all the objects instead of giving each obejct its attribue
    static int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("you have total " + numOfFriends);
    }
}
