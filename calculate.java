import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
    {
        int a;
        int b;
        String operation;

        Scanner Scanner = new Scanner(System.in); //to get the info we used scanner

        System.out.println("Enter the 1st number"); //notifying the person
        a = Scanner.nextInt(); //getting the number

        System.out.println("Enter the 2nd number"); //notifying the person
        b = Scanner.nextInt(); //getting the number

        System.out.println("Enter the operation"); //notifying the person
        operation = Scanner.next(); //getting the operator

        if (operation.equals("+")) //if statement for addition
        {
            System.out.println("Answer: " + (a + b)); //printing the result
        }
        if  (operation.equals("-")) //if statement for extraction
        {
            System.out.println("Answer: " + (a - b)); //printing the result
        }

        if (operation.equals("/")) //if statement for division
        {
            System.out.println("Answer: " + (a / b)); //printing the result
        }
        if (operation.equals("*")) //if statement for multiplication
        {
            System.out.println("Answer: " + (a * b)); //printing the result
        }

    }

	//begum alioglu 119200073
	// yiğit can ayaz 118202068
}
