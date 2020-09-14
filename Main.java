import java.util.Scanner;  

/**
 * convert the tempature the user types from Celsius to Fahrenheit
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);

    //  Prompt the User to enter a temperature in celsius 
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius:");   

    // take the input and store it in a variable 
    int C = input.nextInt(); 

    // Create a second variable that will preform the math formula 
    int IE = (C*9)/5 + 32; 

    // calculate the tempature in Fahrenheit 
    int F = IE;

    // Tell the user the answer in both Fahrenheit and Celsius 
    System.out.println(C + "C is the same as " + F + "F"); 



  
  }
}
