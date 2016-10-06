package com.elysium;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	// Find the size: a. Create an array of ints. b. Print the length of the array to the command line.

        int [] stuff = new int[5];

        stuff[0] = 12;
        stuff[1] = 30;
        stuff[2] = 17;
        stuff[3] = 10;
        stuff[4] = 25;

        System.out.println("size of array:" +stuff.length);

        // Concrete Jungle a. Create a ArrayList of New York City wildlife. b. Create a function that, given an
        // List of Strings, prints for each element: "Today, I spotted a /Thing here/ in the concrete jungle!"

        List<String> wildlife = new ArrayList<>();

        wildlife.add("owl");
        wildlife.add("bat");
        wildlife.add("rat");

        for (int x = 2; x < wildlife.size(); x++){

            System.out.println("Today I spotted an: " +wildlife.get(x));
        }

    }
}
