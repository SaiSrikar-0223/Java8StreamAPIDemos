package Collection;

import java.util.stream.IntStream;

//To find the sum of All digits of a Number using java8 Stream
public class SumOfDigits {
    public static void main(String[] args){

        //Given input
        int number = 12345;
       //Ist Type:
        IntStream stream = String.valueOf(number).chars();
        int sum = stream.map((ch)->Character.getNumericValue(ch)).sum();
        System.out.println("Sum of The given Number is:"+sum);

        //2nd Type
        int sumofNumbers = String.valueOf(number).chars().map((ch)->Character.getNumericValue(ch)).sum();
        System.out.println("Sum of The given Number is:"+sumofNumbers);

        //3rd Type
        System.out.println(String.valueOf(number).chars().map((ch)->Character.getNumericValue(ch)).sum());

    }
}
