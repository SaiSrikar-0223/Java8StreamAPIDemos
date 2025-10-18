package Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {

    public static void main(String[] args){
        //GivenInput
        List<String> words = Arrays.asList("Banana","Apple", "Mango","Cherry","Orange");

        List<String> naturalSortingOrder= words.stream().
                                          sorted().collect(Collectors.toList()); //Natural Sorting order;

        System.out.println("Natural Sorting Order: "+naturalSortingOrder);

        List<String> descendingOrder= words.stream().
                                      sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //Descending Order
        System.out.println("Descending Order is : "+descendingOrder);


    }
}
