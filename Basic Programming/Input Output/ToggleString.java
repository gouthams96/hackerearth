
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Goutham S
 */
public class ToggleString {
       
   
    public static void main(String[] args) {
        String orginalString = new String();
        Scanner in = new Scanner(System.in);
        orginalString = in.nextLine();
          for (int i=0;i<orginalString.length();i++ ) {
                if(orginalString.charAt(i) <= 90 && orginalString.charAt(i) >= 65){

                                    String  letter = Character.toString(orginalString.charAt(i));
                                    System.out.print(letter.toLowerCase());
                }
                else if(orginalString.charAt(i) <= 122 && orginalString.charAt(i) >= 97){
                                    String  letter = Character.toString(orginalString.charAt(i));
                                    System.out.print(letter.toUpperCase());
                }else{
                        System.out.print(orginalString.charAt(i));
                }      
            }
            
        }

    
}
        

    

