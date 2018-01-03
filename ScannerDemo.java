import java.util.Scanner;

public class ScannerDemo {

  public static void main(String[] args){

        Scanner scan = new Scanner (System.in);
        // receice the data from input

        //apply next function to receice String

        System.out.println("next method to receice:");

        if(scan.hasNextLine()){

          String str1 = scan.nextLine();

          System.out.println("The input is " + str1);

          
        }
  }
}
