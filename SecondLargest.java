package Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

    public static void main(String[] args){

        //Given Input
        List<Integer> numbers= Arrays.asList(10,20,35,50,50,75,65);

        int secondLargestNumber = numbers.stream()//Convert List into Stream
                .distinct()//to remove duplicates
                .sorted(Comparator.reverseOrder())// 75,65,60,50,35,20,10 //desc order
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondLargestNumber);
    }
}
