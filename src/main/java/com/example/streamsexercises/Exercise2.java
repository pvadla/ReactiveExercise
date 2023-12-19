package com.example.streamsexercises;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        //Use ReactiveSources.intNumbersFlux and ReactiveSources.userFlux

        //Print all numbers in ReactiveSources.intNumbersFlux
//        ReactiveSources.intNumbersFlux()
//                .subscribe(e -> System.out.println(e));



        //Print all users in ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));


        System.out.println("Press a key to end");
        System.in.read();
    }
}
