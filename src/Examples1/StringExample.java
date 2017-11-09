/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples1;

/**
 *
 * @author alkam5246
 */
public class StringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s = "Hello World";
        
        int length = s.length();
        if (s.charAt(4) == 'e') {
            String newS = s.replace('e','s');
            // Or String newS = s.replaceFirst("e","3");
        }
        //Takes specific string slot number. AKA from 2, "llo world"    
        String part1 = s.substring(2);
        
                //Goes from one number to another, "ell"
                String part2 = s.substring(1, 4);
                
                //Other types of strings
                if(s.startsWith("th"));
                if(s.endsWith("ing"));
    }
}
