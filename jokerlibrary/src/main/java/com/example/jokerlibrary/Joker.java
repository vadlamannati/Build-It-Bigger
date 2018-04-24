package com.example.jokerlibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {

    static List<String> jokes = new ArrayList<>();
    static{
        jokes.add("Did you hear about the actor who fell through the floorboards?");
        jokes.add("Throw him in the mainstream.");
        jokes.add("How about a dumb joke this time??? Lol");
    }

    public String getJoke() {
        return jokes.get(new Random().nextInt(jokes.size()));
    }


}
