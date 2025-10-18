package Collection;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class frequencyCharacter {

    public static void main(String[] args){

        //Given Input
        String input ="Hello World";

       IntStream intStream = input.chars();
       Map<Character,Long> characterLongMap= intStream.mapToObj((c)->(char)c)
               .collect(Collectors.groupingBy(
                       Function.identity(),Collectors.counting()));

       System.out.println(characterLongMap);
    }
}
