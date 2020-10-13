
/**
 * This program will produce a pattern of a random number of asterisks
 * @author Sevde
 */
public class Main {
// make a method to see how many asterisks will be printed 
public static void chaotic (int lineNumbers){
  // make a for loop to see how many will be printed in different lines 
  for( int i = 1; i < lineNumbers; i++ ){
  // generate a random number for how many asterisks will be on a line 
   int randNum = (int) (Math.random()*(5 - 1 + 1 ) + 1);
   // make a for loop inside of a for loop to find the numbers of asterisks in a line 
    for( int count = 1 ; count  < randNum; count++){
    // print out the asterisks in the line 
    System.out.print("*");
    }
    // print out the asterisks "lineNumbers"times in different lines 
    System.out.println ("*");
  }
}
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // do the loop 
     chaotic (6);
  
    
  }
}
