package Collection;

import java.util.Arrays;
import java.util.List;

public class FindAverage {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);
        Double average= numbers.stream()  //Converted the list into Stream
                .mapToInt(num->num.intValue()) //Converted Integer wrapper into int
                .average().getAsDouble(); //average method to calculate
        System.out.println(average);
    }
}
