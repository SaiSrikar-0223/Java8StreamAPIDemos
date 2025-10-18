package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCase {
    public static void main(String[] args){
        //GivenInput
        List<String> words = Arrays.asList("Apple","Banana","Mango","Cherry","Orange");

//        words.stream()
//                .map((string)->string.toUpperCase());

       List<String> upperCaseResult = words.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
       System.out.println(upperCaseResult);

        List<String> lowerCaseResult = words.stream()
                .map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCaseResult);

    }
}
