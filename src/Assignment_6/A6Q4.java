/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author alkam5246
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Ask for two integers
        System.out.println("Enter ten integers: ");

        //Scan, create, and accept ten integers
        Scanner i = new Scanner(System.in);

        //Create 10 integers
        int[] ints = new int[10];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = i.nextInt();
        }


        //Repeat the following from start to end-1
        for (int x = 0; x < ints.length - 1; x++) {
            //Repeat from x+1 to end.
            for (int y = x + 1; y < ints.length; y++) {
                if (ints[x] > ints[y]) {
                    //Swap spot X to spot Y
                    
                }
            }
        }
    }
}

/*repeat from start to end-1 as x:
     repeat from x+1 to end as y:
            if spot[x] > spot[y]:
                    swap spot[x] with spot[y]
*/