package com.mycompany.app;


import com.google.gson.GsonBuilder;

public class App {
    public static void main( String[] args ) {
        User user = new User("Dmytro","Stavyshchenko");
        String json= new GsonBuilder().create().toJson(user);
        System.out.println(json);
    }
}
