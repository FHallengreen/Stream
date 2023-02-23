package com.example.stream;

import java.util.stream.IntStream;

public class Stream2 {

    /**
     2) Given this IntStream: IntStream.range(1,21)
     What's the total amount of numbers in the stream (20 or 21)?
     What's the total of all the numbers?
     What's the average value of all the numbers?
     Raise all numbers to the power of two and print the first 6 numbers
     Raise all numbers to the power of two, and print all the even numbers.
     **/

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,21);
        System.out.println("Total amount of numbers in the stream: " + intStream.count());
        intStream = IntStream.range(1,21);
        System.out.println("Total of all the numbers: " + intStream.sum());
        intStream = IntStream.range(1,21);
        System.out.println("Average value of all the numbers: " + intStream.average().getAsDouble());
        intStream = IntStream.range(1,21);
        intStream.map(n -> n*n).limit(6).forEach(System.out::println);
        intStream = IntStream.range(1,21);
        intStream.map(n -> n*n).filter(n -> n%2 == 0).forEach(System.out::println);

    }
}
