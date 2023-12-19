package com.example.streamsexercises;

public class Exercise1 {

    public static void main(String[] args) {


        //Print all numbers in the intStream
        //StreamSources.intNumbersStream().forEach(i -> System.out.println(i));

        //Print numbers from the intStream that are less than 5
//        StreamSources.intNumbersStream()
//                .filter(i -> i < 5)
//                .forEach(i -> System.out.println(i));


        //Print second and third numbers in intnumbersStream that are greater than 5
//        StreamSources.intNumbersStream()
//                .filter(i -> i > 5)
//                .skip(1)
//                .limit(2)
//                .forEach(i -> System.out.println(i));

        //Print first number in the intnumbersstream that is greater than 5
        // If nothing is found, return -1
//        StreamSources.intNumbersStream()
//                .filter(i -> i > 5)
//                .findFirst()
//                .ifPresentOrElse((i) -> {System.out.println(i);}, () -> {
//                    System.out.println(-1);
//                });


        //Print firstnames of all users in usersstream
//        StreamSources.userStream()
//                .forEach((user) -> System.out.println(user.getFirstName()));

        //Print the firstnames in the usersstream that have ids in the intnumber stream
//        StreamSources.intNumbersStream()
//                .forEach((i) -> {
//                    StreamSources.userStream()
//                            .filter((user) -> user.getId() == i)
//                            .forEach((user -> System.out.println(user.getFirstName())));
//                });

        StreamSources.intNumbersStream()
                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
                .map(user -> user.getFirstName())
                .forEach(userName -> System.out.println(userName));


        StreamSources.userStream()
                .filter(u -> StreamSources.intNumbersStream().anyMatch(i -> u.getId() == i))
                .forEach(user -> System.out.println(user.getFirstName()));

    }
}
