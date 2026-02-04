package OverloadConstructors;

public class Main {
    public static void main(String[] args){
        User user1 = new User();
        User user2 = new User("spongebob");
        User user3 = new User("sBEN-10","ben@gmail.com");
        User user4 = new User("pikachu" , "pika@gmail.com" , 3);


        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.name);
        System.out.println(user4.email);
        System.out.println(user4.age);


    }



}
