package com.example.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {

    /*
* 3) Given this number stream (Observe the use of Integer,not int)
Stream<Integer> numberStream = Stream.of(2,5,8,6,77,34,23,78,99,12);
Print out all numbers sorted ascending.
Print out all numbers sorted descending.
Print out all EVEN numbers sorted ascending.
Print out all EVEN numbers sorted ascending but skip the first 5 numbers
Print out the max number
Extra:  Add this class to your project (provide it with getters and a tostring method

class NumberInfo {
int number;
String info;
public NumberInfo(int n) {
this.number = n;
this.info = n%2==0 ? "Even": "uneven";
}
}
Add the necessary stream methods to sort the numbers and convert the original numbers into a list like this: List<NumberInfo> infos = numberStream….

Add a toString method to the NumberInfo class and print all items to verify.
*/

    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(2,5,8,6,77,34,23,78,99,12);
        List<Integer> sortedNumbers = numberStream.sorted().collect(Collectors.toList());
//        System.out.println(sortedNumbers);
        numberStream = Stream.of(2,5,8,6,77,34,23,78,99,12);
        List<Integer> reversedOrder = numberStream.sorted(Comparator.reverseOrder()).toList();
//        System.out.println(reversedOrder);

    }
}
