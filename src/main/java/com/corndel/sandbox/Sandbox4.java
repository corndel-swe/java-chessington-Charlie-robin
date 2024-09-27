package com.corndel.sandbox;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Printable {
    String getPrintInfo();
}

class User implements Printable, Comparable<User>{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getPrintInfo() {
        return "Im a user";
    }

    @Override
    public int compareTo(@NotNull User user) {
        return name.compareTo(user.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Message implements Printable{

    @Override
    public String getPrintInfo() {
        return "I am a Message";
    }
}

public class Sandbox4 {
    public static void main(String[] args) {
        Printable message = new Message();

        List<Message> messages = new ArrayList<>();

//        messages.add(new Message());
//        messages.add(new Message());
//        messages.add(new Message());
//
//        Collections.sort(messages);

        // COMPARABLE
        // - ALLOWS OBJECTS TO DEFINE THEIR NATURAL ORDER
        // - IF YOU IMPLEMENT COMPARE TO YOU CAN SEE WHICH ORDER OBJECTS NEED TO BE IN

        List<User> users = new ArrayList<>();

        users.add(new User("James"));
        users.add(new User("Charlie"));
        users.add(new User("Anna"));

        users.forEach(System.out::println);

        Collections.sort(users);

        System.out.println("-".repeat(10));

        users.forEach(System.out::println);

        print(message);

    }

    public static void print(Printable printable){
        System.out.println("-".repeat(10));
        System.out.println("Printing.....");
        System.out.println(printable.getPrintInfo());
        System.out.println("-".repeat(10));
    }
}
