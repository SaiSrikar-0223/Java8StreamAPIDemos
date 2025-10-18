package Collection;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

    public static void main(String[] args){
        //Given Input String
        String input ="Hello Java World";

        //String[] strArray= input.split(" ");

//        Stream<String> stream = Stream.of(input.split(" "));

//        String reverseword= stream.map(word->new StringBuilder(word).reverse().toString())
//                .collect(Collectors.joining(" "));

        String reverseword = Stream.of(input.split(" "))
                 .map(word->new StringBuilder(word).reverse().toString())
                 .collect(Collectors.joining(" "));

        System.out.println(reverseword);
    }
}
