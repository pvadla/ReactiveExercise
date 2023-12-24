package com.example.streamsexercises;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

public class ReactiveSources {

    public static Flux<String> stringNumberFlux(){
        return Flux.just("one", "two","three","four","five","six","seven","eight","nine","ten")
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumbersFlux(){
        return Flux
                .range(1,10)
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumberFluxWithException(){
        return Flux
                .range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .map(e -> {
                        if(e == 5) throw new RuntimeException("An error happened in flux");
                        return e;
                });
    }

    public static Mono<Integer> intNumberMono() {
        return Mono.just(42)
                .delayElement(Duration.ofSeconds(1));
    }

    public static Mono<User> userMono() {
        return Mono.just(
                new User(1, "Lionel", "Messi")
        ).delayElement(Duration.ofSeconds(1));
    }

    public static Flux<User> userFlux() {
        return Flux.just(
                new User(1, "Lionel", "Messi"),
                new User(1, "Lionel", "Messi"),
                new User(1, "Lionel", "Messi")
        ).delayElements(Duration.ofSeconds(1));
    }
}
