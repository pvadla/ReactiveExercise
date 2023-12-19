package com.example.streamsexercises;

import java.util.stream.Stream;

public class StreamSources {

    public static Stream<String> stringNumberStream(){
        return Stream.of("one", "two","three","four","five","six","seven","eight","nine","ten");
    }

    public static Stream<Integer> intNumbersStream(){
        return Stream.iterate(0, i -> i + 2).limit(10);
    }


    public static Stream<User> userStream(){

        return Stream.of(
                new User(1, "Lionel", "Messi"),
                new User(2, "Lionel2", "Messi2"),
                new User(2, "Lionel22", "Messi22"),
                new User(3, "Lionel3", "Messi3"),
                new User(4, "Lionel4", "Messi4"),
                new User(5, "Lionel5", "Messi5"),
                new User(6, "Lionel6", "Messi6")
        );
    }


}
