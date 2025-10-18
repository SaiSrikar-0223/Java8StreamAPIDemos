package Collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args){

        //Creating a Scanner Object to read the user input
        try(Scanner scanner =new Scanner(System.in)){
            System.out.println("Enter your birthdate (YYYY-MMM-DD):");

            String birtdhdateString=  scanner.nextLine();

            LocalDate birthDate= LocalDate.parse(birtdhdateString);

            //Get the Current Date
            LocalDate currentDate= LocalDate.now();

            Period age = Period.between(currentDate,birthDate);

            System.out.println("You are"+age.getYears()+"years old");
        }
    }
}
