package com.example.streamsexercises;

import java.io.IOException;
import java.util.Optional;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        //Use Reactive Sources intNumberMono

        //Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(
                number -> System.out.println(number),
                err -> System.out.println(err.getMessage()),
                        () -> System.out.println("Complete")
        );




        //Get the value from the Mono into an integer variable
        Optional<Integer> number = ReactiveSources.intNumberMono().blockOptional();




        System.out.println("Press a key to end");
        System.in.read();
    }
}
