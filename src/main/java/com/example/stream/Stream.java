package com.example.stream;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    /**
     *     1) Given this List
     * List<String> names= Arrays.asList("peter","jan","john","janne","celine");
     * Create or print a list with the same size, but with each name capitalised (Peter, Jan ...)
     * Change the list above so that all items are sorted alphabetically
     * Change the list above so that all items are sorted in the reverse order
     * Change the example above to return a single string, like this:
     * "Sorted names as String : Peter,John,Janne,Jan,Celine"
     **/

    public static void main(String[] args) {

        List<String> names= Arrays.asList("peter","jan","john","janne","celine");
        String newNames = names.stream().map(StringUtils::capitalize)
                .sorted(Comparator.reverseOrder()).collect(Collectors.joining
                        (",","Sorted names as String : ", ""));
        System.out.println(newNames);
    }
}
