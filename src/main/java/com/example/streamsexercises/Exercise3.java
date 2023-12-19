package com.example.streamsexercises;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        //Use Reactive Sources intNumberFlux()

        //Get all the numbers in the Reactive Source intNumberFlux stream
        // into a list and print the list and its size

        List<Integer> numbers = ReactiveSources.intNumbersFlux()
                        .toStream()
                                .toList();
        System.out.println("List is: "+ numbers);
        System.out.println("Size: "+ numbers.size());

        System.out.println("Press a key to end");
        System.in.read();
    }
}
