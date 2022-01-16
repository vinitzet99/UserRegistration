/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * takes String and Int input and return output
 */
package userregistration;

import java.util.Scanner;

public class UtilityClass {
    Scanner sc = new Scanner(System.in);

    public String getString() {
        sc.nextLine();
        return sc.nextLine();
    }

    public int getInt() {
        return sc.nextInt();
    }
}
