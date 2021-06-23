package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Lilly");
        User user2 = new User("Paul");
        User user3 = new User("Eddy");

        user1.sendMessage(user2, "Say hello");
        user1.sendMessage(user2,"What are you going?");

        user2.sendMessage(user1,"I am very busy today");
        user2.sendMessage(user1,"Can you call me later?");
        user2.sendMessage(user1,"Or I can call you myself");

        user3.sendMessage(user1,"Hi");
        user3.sendMessage(user1,"Do you ready go in beach?");
        user3.sendMessage(user1,"I will come to you at 12.00");

        user1.sendMessage(user3,"Hi");
        user1.sendMessage(user3,"Yeah, I ready. Where we will go?");
        user1.sendMessage(user3,"Okay, see you later");

        user3.sendMessage(user1,"We will go in sandy beach");


        MessageDataBase.showDialog(user1,user3);
    }

    }

