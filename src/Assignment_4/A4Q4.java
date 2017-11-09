/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Ask for the prices.
        System.out.println("How much does the food for prom cost?:");

        //Scan the answer.
        Scanner food = new Scanner(System.in);

        //Get the number.
        double number = food.nextDouble();

        //Repeat for the remaining questions.
        System.out.println("How much does the DJ cost?:");
        Scanner djCost = new Scanner(System.in);
        double numberOne = djCost.nextDouble();

        System.out.println("How much does it cost to rent the hall?:");
        Scanner hallRent = new Scanner(System.in);
        double numberTwo = hallRent.nextDouble();

        System.out.println("How muchj does decorations cost?:");
        Scanner decorationsCost = new Scanner(System.in);
        double numberThree = decorationsCost.nextDouble();

        System.out.println("How much does it cost for staff?:");
        Scanner staffCost = new Scanner(System.in);
        double numberFour = staffCost.nextDouble();

        System.out.println("How much for miscellaneous costs?:");
        Scanner miscCost = new Scanner(System.in);
        double numberFive = miscCost.nextDouble();

        
        //Get the total cost for the prom.
        double total = numberFive + numberFour + numberThree + numberTwo + + numberOne + number;

        //Divide the cost by how much tickets will be needed to pay it.
        double tickets = Math.ceil(total / 35);
        
        System.out.println("The total cost is " + total + ". You will need to sell " + tickets + " tickets to break even.");
    }
}
