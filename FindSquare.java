package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the Square of the first 3 even numbers using Java8 Stream
public class FindSquare {

    public static void main(String[] args){
       //Given input
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> results = numbers.stream()
                .filter(n-> n%2 == 0)
                .limit(3)//limit to the first 3 even numbers
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.print("Square of the first 3 even numbers is: "+results);
    }
}
