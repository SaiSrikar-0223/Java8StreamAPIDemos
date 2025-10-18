package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//To find the maximum and minimum numbers from the given list using Java 8 Stream
public class MaximumMinimumStreams {

    public static void main(String[] args){

      //Gven List
        List<Integer> numbers = Arrays.asList(10,9,8,7,6,5,4,3,2,1);

      //Convert List into Stream and find the max and min of numbers:
        int maxNumber= numbers.stream()
                       .mapToInt((num)->num.intValue()).max().getAsInt();
        System.out.print("Maximum Number is:"+maxNumber+"\n");

        int minNumber = numbers.stream()
                        .mapToInt((num)->num.intValue()).min().getAsInt();
        System.out.println("Minimum Number is:"+minNumber);

        int maximumNumber= numbers.stream()
                .mapToInt(Integer::intValue).max().getAsInt();
        System.out.print("Maximum Number is:"+maxNumber+"\n");
    }
}
