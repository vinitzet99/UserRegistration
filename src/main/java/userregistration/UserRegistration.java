/**
 * @author: Vinit Kumar
 * @Created on: 16/01/2022
 * Regex to validate User Details
 */
package userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public Boolean isValidName(String name) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        return m.matches();
    }
}
