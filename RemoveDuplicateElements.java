package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args){
        //Given List of Integers
        List<Integer> numbers = Arrays.asList(1,2,3,3,2,4,5,8,9,1,10);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Integer Numbers are :"+distinctNumbers);

        //Given List of String
        List<String> fruits = Arrays.asList("apple","banana","apple","mango","grapes","orange","banana");
        List<String> distinctFruits= fruits.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct fruits are: "+distinctFruits);

    }
}
