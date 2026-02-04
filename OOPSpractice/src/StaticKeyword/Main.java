package StaticKeyword;

public class Main {
    public static void main(String[] args){

        // static methods and static attributes can be accesed by class name
        Friend friend1 = new Friend("BEN-10");
        Friend friend2 = new Friend("pikachu");


        Friend.showFriends();
    }
}
