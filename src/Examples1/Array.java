/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples1;

import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Create scanner for input
        Scanner input = new Scanner(System.in);

        //Create array to store costs
        double[] expenses = new double[6];
        //Create array to store names of expenses
        String[] expenseNames = new String[6];
        //Put names into array
        expenseNames[0] = "food";
        expenseNames[1] = "DJ";
        expenseNames[2] = "hall rental";
        expenseNames[3] = "decorations";
        expenseNames[4] = "staff fees";
        expenseNames[5] = "miscellaneous";

        //Use a loop to get all the info
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("How much does the " + expenseNames[i] + " cost?");
            //storing the expenses
            expenses[i] = input.nextDouble();
        }
        //get all expenses, add them up
        //start at 0
        double total = 0;
        //go through each expense
        for(int i = 0; i < expenses.length; i++) {
            //Add expenses to total
            total = total + expenses[i];
        }
        //Calculate number of tickets to sell
        int tickets = (int)Math.ceil(total/35);
        System.out.println("Prom will cost " + total + " dollars.");
        System.out.println("You will need to sell " + tickets + " tickets.");
    }
}
