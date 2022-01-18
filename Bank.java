import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String mortgageChoice = scan.next();
        scan.nextLine();

        if (mortgageChoice.equals("yes")) {
             //Task 2 - Print this if the decision is "yes"
        System.out.println("\nGreat! In one line" +
        "\nHow much money do you have in your savings?" +
        "\nAnd, how much do you owe in credit card debt?");
        
        // Task 3 - Pick up each value 
        int savings = scan.nextInt();
        int debt = scan.nextInt();
                
            System.out.println("\nHow many years have you worked for?");
            int yearsWorked = scan.nextInt();
               // Task 4 - Pick up number of years

            System.out.println("\nWhat is your name?");
            String name = scan.next();
               // Task 5 - Pick up the user's name

               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.    
               if (savings > 5000 && debt < 1000) {
                System.out.println("\nCongratulations " + name +" You have been approved!");
               } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
               }
            } else {
                System.out.println("\nHave a nice day");
            }    
                
        //Task 2 - Print this if the decision was not "yes"


        scan.close();
    }
}